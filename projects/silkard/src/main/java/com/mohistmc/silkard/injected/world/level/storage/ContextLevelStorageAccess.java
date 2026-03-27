package com.mohistmc.silkard.injected.world.level.storage;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.dimension.LevelStem;

public interface ContextLevelStorageAccess {

    default ResourceKey<LevelStem> silkard$getTypeKey() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setDimType(ResourceKey<LevelStem> typeKey) {
        throw new ContextStateException("Not implemented");
    }
}
