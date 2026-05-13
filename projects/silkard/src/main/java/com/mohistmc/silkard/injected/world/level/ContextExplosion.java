package com.mohistmc.silkard.injected.world.level;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextExplosion {

    default float silkard$getYield() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setYield(float yield) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$wasCanceled() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$wasCanceled(boolean wasCanceled) {
        throw new ContextStateException("Not implemented");
    }
}
