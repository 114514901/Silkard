package com.mohistmc.silkard.injected.world.level.chunk;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.server.level.ServerLevel;

public interface ContextLevelChunk {

    default org.bukkit.Chunk getBukkitChunk() {
        throw new ContextStateException("Not implemented");
    }

    default ServerLevel silkard$r() {
        throw new ContextStateException("Not implemented");
    }

    default void loadCallback() {
        throw new ContextStateException("Not implemented");
    }

    default void unloadCallback() {
        throw new ContextStateException("Not implemented");
    }
}
