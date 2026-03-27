package com.mohistmc.silkard.injected.world.entity;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAgeableMob {

    default boolean silkard$ageLocked() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setAgeLocked(boolean ageLocked) {
        throw new ContextStateException("Not implemented");
    }
}
