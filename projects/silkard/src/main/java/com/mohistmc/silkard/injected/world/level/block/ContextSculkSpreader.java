package com.mohistmc.silkard.injected.world.level.block;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.level.Level;

public interface ContextSculkSpreader {

    default Level silkard$level() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setLevel(Level level) {
        throw new ContextStateException("Not implemented");
    }
}
