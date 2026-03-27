package com.mohistmc.silkard.injected.server.players;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.Date;

public interface ContextBanListEntry {

    default Date getCreated() {
        throw new ContextStateException("Not implemented");
    }
}
