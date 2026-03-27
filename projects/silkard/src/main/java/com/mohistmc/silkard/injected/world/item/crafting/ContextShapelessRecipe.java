package com.mohistmc.silkard.injected.world.item.crafting;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.NamespacedKey;

public interface ContextShapelessRecipe extends ContextRecipe{

    @Override
    default org.bukkit.inventory.ShapelessRecipe toBukkitRecipe(NamespacedKey id) {
        throw new ContextStateException("Not implemented");
    }
}
