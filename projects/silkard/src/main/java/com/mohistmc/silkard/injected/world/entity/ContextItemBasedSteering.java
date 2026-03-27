package com.mohistmc.silkard.injected.world.entity;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextItemBasedSteering {

    default void setBoostTicks(int ticks) {
        throw new ContextStateException("Not implemented");
    }
}
