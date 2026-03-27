package com.mohistmc.silkard.injected.server.network;

import com.mohistmc.silkard.util.ContextStateException;
import com.mojang.authlib.GameProfile;

public interface ContextServerLoginPacketListenerImpl {

    default void disconnect(String s) {
        throw new ContextStateException("Not implemented");
    }

    default void callPlayerPreLoginEvents(GameProfile gameprofile) throws Exception {
        throw new ContextStateException("Not implemented");
    }
}
