package com.mohistmc.silkard.injected.world.level.block.entity;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public interface ContextContainerOpenersCounter {

    default boolean silkard_opened() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_opened(boolean opened) {
        throw new ContextStateException("Not implemented");
    }

    default void onAPIOpen(Level world, BlockPos blockposition, BlockState iblockdata) {
        throw new ContextStateException("Not implemented");
    }

    default void onAPIClose(Level world, BlockPos blockposition, BlockState iblockdata) {
        throw new ContextStateException("Not implemented");
    }

    default void openerAPICountChanged(Level world, BlockPos blockposition, BlockState iblockdata, int i, int j) {
        throw new ContextStateException("Not implemented");
    }
}
