package com.mohistmc.silkard.injected.world.level.block.entity;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.item.ItemStack;

/**
 * @author Mgazul
 * @date 2026/4/2 19:22
 */
public interface ContextJukeboxBlockEntity {

    default void setSongItemWithoutPlaying(ItemStack itemStack, long ticksSinceSongStarted) {
        throw new ContextStateException("Not implemented");
    }
}
