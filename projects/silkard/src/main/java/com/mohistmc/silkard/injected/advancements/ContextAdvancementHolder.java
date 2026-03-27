package com.mohistmc.silkard.injected.advancements;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAdvancementHolder {

    default org.bukkit.advancement.Advancement toBukkit() {
        throw new ContextStateException("Not implemented");
    }
}
