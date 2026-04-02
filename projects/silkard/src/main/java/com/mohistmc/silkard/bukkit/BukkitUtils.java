package com.mohistmc.silkard.bukkit;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import net.minecraft.core.BlockPos;
import net.minecraft.core.RegistryAccess;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.commands.ReloadCommand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityReference;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.ConduitBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.WorldData;
import net.minecraft.world.phys.AABB;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.CraftRegistry;
import org.bukkit.craftbukkit.CraftServer;

/**
 * @author Mgazul
 * @date 2026/4/2 14:56
 */
public class BukkitUtils {

    public static long pluginTimeout = 0L;

    public static MinecraftServer getServer() {
        return (Bukkit.getServer() instanceof CraftServer) ? ((CraftServer) Bukkit.getServer()).getServer() : null;
    }

    public static RegistryAccess getDefaultRegistryAccess() {
        return CraftRegistry.getMinecraftRegistry();
    }

    public static List getHumansInRange(Level level, BlockPos worldPosition, int i) {
        {
            double d0 = (double) (i * 10 + 10);

            AABB aabb = (new AABB(worldPosition)).inflate(d0).expandTowards(0.0D, (double) level.getHeight(), 0.0D);
            List<Player> list = level.<Player>getEntitiesOfClass(Player.class, aabb);

            return list;
        }
    }

    // CraftBukkit start
    public static void reload(MinecraftServer minecraftserver) {
        PackRepository packrepository = minecraftserver.getPackRepository();
        WorldData worlddata = minecraftserver.getWorldData();
        Collection<String> collection = packrepository.getSelectedIds();
        Collection<String> collection1 = ReloadCommand.discoverNewPacks(packrepository, worlddata, collection);
        minecraftserver.reloadResources(collection1);
    }
    // CraftBukkit end

    public static int getRange(List<BlockPos> effectBlocks) {
        // CraftBukkit end
        int i = effectBlocks.size();
        int j = i / 7 * 16;
        // CraftBukkit start
        return j;
    }

    public static void updateAndAttackTarget(final ServerLevel level, final BlockPos worldPosition, final BlockState blockState, final ConduitBlockEntity entity, final boolean isActive, boolean damageTarget) {
        EntityReference<LivingEntity> entityreference = ConduitBlockEntity.updateDestroyTarget(entity.destroyTarget, level, worldPosition, isActive);
        LivingEntity livingentity = EntityReference.getLivingEntity(entityreference, level);

        // CraftBukkit start
        if (damageTarget && livingentity != null) {
            if (livingentity.hurtServer(level, level.damageSources().magic().directBlock(level, worldPosition), 4.0F)) {
                level.playSound((Entity) null, livingentity.getX(), livingentity.getY(), livingentity.getZ(), SoundEvents.CONDUIT_ATTACK_TARGET, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            // CraftBukkit end
        }

        if (!Objects.equals(entityreference, entity.destroyTarget)) {
            entity.destroyTarget = entityreference;
            level.sendBlockUpdated(worldPosition, blockState, blockState, 2);
        }
    }
}
