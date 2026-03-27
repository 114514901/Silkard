package com.mohistmc.silkard.injected.world.item.crafting;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Recipe;

public interface ContextRecipe {

    default Recipe toBukkitRecipe(NamespacedKey id) {
        throw new ContextStateException("Not implemented");
    }
}
