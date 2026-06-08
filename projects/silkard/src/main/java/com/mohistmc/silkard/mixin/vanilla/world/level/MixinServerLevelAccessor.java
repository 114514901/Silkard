package com.mohistmc.silkard.mixin.vanilla.world.level;

import com.mohistmc.silkard.injected.world.level.ContextServerLevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ServerLevelAccessor;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ServerLevelAccessor.class)
public interface MixinServerLevelAccessor extends ContextServerLevelAccessor {

    @Overwrite
    default void addFreshEntityWithPassengers(Entity entity) {
        this.addFreshEntityWithPassengers(entity, CreatureSpawnEvent.SpawnReason.DEFAULT);
    }

    @Override
    default void addFreshEntityWithPassengers(Entity entity, CreatureSpawnEvent.SpawnReason reason) {
        entity.getSelfAndPassengers().forEach((e) -> this.addFreshEntity(e, reason));
    }

    default ServerLevel getMinecraftWorld() {
        return getLevel();
    }
}
