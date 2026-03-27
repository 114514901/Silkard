package com.mohistmc.silkard.injected.server.level;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.server.level.ChunkMap;
import net.minecraft.world.level.chunk.LevelChunk;

public interface ContextChunkHolder {

    default LevelChunk getFullChunkNow() {
        throw new ContextStateException("Not implemented");
    }

    default LevelChunk getFullChunkNowUnchecked() {
        throw new ContextStateException("Not implemented");
    }

    default void callEventIfUnloading(ChunkMap chunkmap) {
        throw new ContextStateException("Not implemented");
    }
}
