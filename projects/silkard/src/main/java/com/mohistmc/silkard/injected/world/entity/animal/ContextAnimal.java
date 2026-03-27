package com.mohistmc.silkard.injected.world.entity.animal;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.item.ItemStack;

public interface ContextAnimal {

    default ItemStack getBreedItem() {
        throw new ContextStateException("Not implemented");
    }
}
