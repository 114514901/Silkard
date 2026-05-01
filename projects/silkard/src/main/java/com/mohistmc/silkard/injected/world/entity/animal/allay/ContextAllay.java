package com.mohistmc.silkard.injected.world.entity.animal.allay;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.animal.allay.Allay;

public interface ContextAllay {

    default Allay duplicateAllay0() {
        throw new ContextStateException("Not implemented");
    }

    default void setCanDuplicate(boolean canDuplicate) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$forceDancing() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$forceDancing(boolean forceDancing) {
        throw new ContextStateException("Not implemented");
    }
}
