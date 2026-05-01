package com.mohistmc.silkard.injected.world.entity.animal.equine;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAbstractHorse {

    default int silkard$maxDomestication() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$maxDomestication(int maxDomestication) {
        throw new ContextStateException("Not implemented");
    }
}
