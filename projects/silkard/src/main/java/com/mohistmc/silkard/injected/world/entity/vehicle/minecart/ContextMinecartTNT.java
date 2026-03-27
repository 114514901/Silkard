package com.mohistmc.silkard.injected.world.entity.vehicle.minecart;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextMinecartTNT {

    default boolean silkard$isIncendiary() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setIsIncendiary(boolean isIncendiary) {
        throw new ContextStateException("Not implemented");
    }
}
