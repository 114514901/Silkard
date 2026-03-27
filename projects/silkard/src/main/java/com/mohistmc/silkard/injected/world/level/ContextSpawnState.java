package com.mohistmc.silkard.injected.world.level;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.MobCategory;

public interface ContextSpawnState {

    default boolean canSpawnForCategory(MobCategory mobCategory, int limit) {
        throw new ContextStateException("Not implemented");
    }
}
