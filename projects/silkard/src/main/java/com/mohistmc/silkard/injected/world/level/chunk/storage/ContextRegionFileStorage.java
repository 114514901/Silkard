package com.mohistmc.silkard.injected.world.level.chunk.storage;

import com.mohistmc.silkard.util.ContextStateException;
import java.io.IOException;
import net.minecraft.world.level.ChunkPos;

public interface ContextRegionFileStorage {

    default boolean chunkExists(ChunkPos pos) throws IOException {
        throw new ContextStateException("Not implemented");
    }
}
