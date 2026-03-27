package com.mohistmc.silkard.injected.world.level;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextLevelAccessor {
    default net.minecraft.server.level.ServerLevel getMinecraftWorld() {
        throw new ContextStateException("Not implemented");
    }
}
