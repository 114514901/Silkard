package com.mohistmc.silkard.injected.server.network;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextServerConnectionListener {

    default void acceptConnections() {
        throw new ContextStateException("Not implemented");
    }
}
