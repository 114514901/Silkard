package com.mohistmc.silkard.mixin.vanilla.world.entity.animal.allay;

import com.mohistmc.silkard.injected.world.entity.animal.allay.ContextAllay;
import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/5/1 17:57
 */
@Mixin(Allay.class)
public abstract class MixinAllay extends PathfinderMob implements ContextAllay {

    @Shadow @Final
    private static EntityDataAccessor<Boolean> DATA_CAN_DUPLICATE;
    @Shadow public abstract void resetDuplicationCooldown();

    public boolean forceDancing = false; // CraftBukkit

    protected MixinAllay(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);
    }

    public Allay duplicateAllay0() {
        Allay allay = EntityType.ALLAY.create(this.level(), EntitySpawnReason.BREEDING);

        if (allay != null) {
            allay.snapTo(this.position());
            allay.setPersistenceRequired();
            allay.resetDuplicationCooldown();
            this.resetDuplicationCooldown();
            this.level().addFreshEntity(allay, org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason.DUPLICATION); // CraftBukkit - reason for duplicated allay
        }
        return allay; // CraftBukkit
    }

    public void setCanDuplicate(boolean canDuplicate) {
        this.entityData.set(DATA_CAN_DUPLICATE, canDuplicate);
    }

    public boolean silkard$forceDancing() {
        return forceDancing;
    }

    public void silkard$forceDancing(boolean forceDancing) {
        this.forceDancing = forceDancing;
    }
}
