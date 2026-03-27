package com.mohistmc.silkard.injected.world.entity.monster;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextCreeper {

    default void setPowered(boolean power) {
        throw new ContextStateException("Not implemented");
    }
}
