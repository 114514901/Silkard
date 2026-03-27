package com.mohistmc.silkard.injected.world.entity.monster;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextSlime {

    default boolean canWander() {
        throw new ContextStateException("Not implemented");
    }

    default void setWander(boolean canWander) {
        throw new ContextStateException("Not implemented");
    }
}
