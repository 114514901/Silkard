package com.mohistmc.silkard.injected.world.level.block;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextFireBlock {

    default boolean silkard$canBurn(net.minecraft.world.level.block.Block block) {
        throw new ContextStateException("Not implemented");
    }
}
