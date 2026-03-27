package com.mohistmc.silkard.injected.world.level.block.entity;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.level.Level;

public interface ContextCatalystListener {

    default Level silkard$level() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setLevel(Level level) {
        throw new ContextStateException("Not implemented");
    }
}
