package com.mohistmc.silkard.injected.core.component;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.component.DataComponentType;

public interface ContextDataComponentPatchBuilder {

    default void copy(DataComponentPatch orig) {
        throw new ContextStateException("Not implemented");
    }

    default void clear(DataComponentType<?> type) {
        throw new ContextStateException("Not implemented");
    }

    default boolean isEmpty() {
        throw new ContextStateException("Not implemented");
    }

    default boolean isSet(DataComponentType<?> type) {
        throw new ContextStateException("Not implemented");
    }
}
