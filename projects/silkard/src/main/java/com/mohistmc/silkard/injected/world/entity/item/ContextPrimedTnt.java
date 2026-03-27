package com.mohistmc.silkard.injected.world.entity.item;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextPrimedTnt {

    default float silkard$yield() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setYield(float yield) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$isIncendiary() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setIsIncendiary(boolean isIncendiary) {
        throw new ContextStateException("Not implemented");
    }
}
