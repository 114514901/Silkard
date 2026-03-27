package com.mohistmc.silkard.injected.network;

import com.mohistmc.silkard.util.ContextStateException;
import java.net.SocketAddress;

public interface ContextConnection {

    default String silkard$hostname() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setHostName(String hostName) {
        throw new ContextStateException("Not implemented");
    }

    default SocketAddress getRawAddress() {
        throw new ContextStateException("Not implemented");
    }
}
