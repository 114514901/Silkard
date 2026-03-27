package com.mohistmc.silkard.injected.world.level;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import org.bukkit.event.entity.CreatureSpawnEvent;

public interface ContextServerLevelAccessor {

    default boolean addFreshEntityWithPassengers(Entity entity, CreatureSpawnEvent.SpawnReason reason) {
        throw new ContextStateException("Not implemented");
    }

    default ServerLevel getMinecraftWorld() {
        throw new ContextStateException("Not implemented");
    }
}
