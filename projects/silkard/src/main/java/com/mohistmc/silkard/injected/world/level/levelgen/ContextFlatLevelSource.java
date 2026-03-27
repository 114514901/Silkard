package com.mohistmc.silkard.injected.world.level.levelgen;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.level.biome.BiomeSource;

public interface ContextFlatLevelSource {

    default void silkard$setBiomeSource(BiomeSource biomeSource) {
        throw new ContextStateException("Not implemented");
    }
}
