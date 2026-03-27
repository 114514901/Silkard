package com.mohistmc.silkard.injected.world.item.crafting;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public interface ContextIngredient {

    default boolean silkard$exact() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setItemStacks(List<ItemStack> itemStacks) {
        throw new ContextStateException("Not implemented");
    }

    default List<ItemStack> itemStacks() {
        throw new ContextStateException("Not implemented");
    }
}
