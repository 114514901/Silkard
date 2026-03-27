package com.mohistmc.silkard.injected.server.level;

import com.mohistmc.silkard.bukkit.BukkitCallbackExecutor;
import com.mohistmc.silkard.util.ContextStateException;

public interface ContextChunkMap {

    default BukkitCallbackExecutor silkard$callbackExecutor() {
        throw new ContextStateException("Not implemented");
    }
}
