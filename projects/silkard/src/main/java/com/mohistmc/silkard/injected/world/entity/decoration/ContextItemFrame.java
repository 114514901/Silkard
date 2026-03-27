package com.mohistmc.silkard.injected.world.entity.decoration;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.item.ItemStack;

public interface ContextItemFrame {

    default void setItem(ItemStack itemstack, boolean updateNeighbours, boolean playSound) {
        throw new ContextStateException("Not implemented");
    }
}
