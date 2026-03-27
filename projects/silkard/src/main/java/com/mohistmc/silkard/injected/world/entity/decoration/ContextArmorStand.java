package com.mohistmc.silkard.injected.world.entity.decoration;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextArmorStand {

    default boolean silkard$canMove() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setCanMove(boolean canMove) {
        throw new ContextStateException("Not implemented");
    }
}
