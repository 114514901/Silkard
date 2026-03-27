package com.mohistmc.silkard.injected.world.level.border;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.level.Level;

public interface ContextWorldBorder {

    default Level silkard$world() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setWorld(Level world) {
        throw new ContextStateException("Not implemented");
    }
}
