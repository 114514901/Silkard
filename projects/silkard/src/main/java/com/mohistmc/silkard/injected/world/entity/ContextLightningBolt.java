package com.mohistmc.silkard.injected.world.entity;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextLightningBolt {

    default boolean silkard$isSilent() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setIsSilent(boolean isSilent) {
        throw new ContextStateException("Not implemented");
    }
}
