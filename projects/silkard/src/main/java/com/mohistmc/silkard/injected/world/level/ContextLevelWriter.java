package com.mohistmc.silkard.injected.world.level;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.Entity;
import org.bukkit.event.entity.CreatureSpawnEvent;

public interface ContextLevelWriter {

    default boolean addFreshEntity(Entity entity, CreatureSpawnEvent.SpawnReason reason) {
        throw new ContextStateException("Not implemented");
    }
}
