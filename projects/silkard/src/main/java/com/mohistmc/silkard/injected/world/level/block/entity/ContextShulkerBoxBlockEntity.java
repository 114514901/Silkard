package com.mohistmc.silkard.injected.world.level.block.entity;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextShulkerBoxBlockEntity {

    default boolean silkard_opened() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_opened(boolean opened) {
        throw new ContextStateException("Not implemented");
    }
}
