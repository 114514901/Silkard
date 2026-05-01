package com.mohistmc.silkard.injected.world.entity.animal.equine;

import com.mohistmc.silkard.util.ContextStateException;

/**
 * @author Mgazul
 * @date 2026/5/1 18:25
 */
public interface ContextLlama {

    default void setStrengthPublic(int i) {
        throw new ContextStateException("Not implemented");
    }
}
