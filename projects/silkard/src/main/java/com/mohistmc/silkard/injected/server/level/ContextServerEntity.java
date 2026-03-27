package com.mohistmc.silkard.injected.server.level;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.Set;
import net.minecraft.server.network.ServerPlayerConnection;

public interface ContextServerEntity {

    default void setTrackedPlayers(Set<ServerPlayerConnection> trackedPlayers) {
        throw new ContextStateException("Not implemented");
    }
}
