package com.mohistmc.silkard.injected.world.level.chunk;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkAccess;

public interface ContextChunkGenerator {

    default void addDecorations(WorldGenLevel region, ChunkAccess chunk, StructureManager structureManager) {
        throw new ContextStateException("Not implemented");
    }

    default void applyBiomeDecoration(WorldGenLevel level, ChunkAccess chunkAccess, StructureManager structureFeatureManager, boolean vanilla) {
        throw new ContextStateException("Not implemented");
    }
}
