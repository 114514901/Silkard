package com.mohistmc.silkard.injected.util;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextTickThrottler {

    default boolean isIncrementAndUnderThreshold() {
        throw new ContextStateException("Not implemented");
    }

    default boolean isIncrementAndUnderThreshold(int incrementStep, int threshold) {
        throw new ContextStateException("Not implemented");
    }
}
