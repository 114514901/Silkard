package com.mohistmc.silkard.injected.server.bossevents;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.boss.KeyedBossBar;

public interface ContextCustomBossEvent {

    default KeyedBossBar getBukkitEntity() {
        throw new ContextStateException("Not implemented");
    }
}
