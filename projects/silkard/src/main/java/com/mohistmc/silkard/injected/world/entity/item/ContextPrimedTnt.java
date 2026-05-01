package com.mohistmc.silkard.injected.world.entity.item;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextPrimedTnt {

    default boolean silkard$isIncendiary() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$isIncendiary(boolean isIncendiary) {
        throw new ContextStateException("Not implemented");
    }
}
