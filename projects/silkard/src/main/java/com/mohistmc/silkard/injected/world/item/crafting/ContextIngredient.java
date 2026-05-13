package com.mohistmc.silkard.injected.world.item.crafting;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.List;
import net.minecraft.world.item.ItemStack;

public interface ContextIngredient {

    default boolean isExact() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$itemStacks(List<ItemStack> itemStacks) {
        throw new ContextStateException("Not implemented");
    }

    default List<ItemStack> itemStacks() {
        throw new ContextStateException("Not implemented");
    }
}
