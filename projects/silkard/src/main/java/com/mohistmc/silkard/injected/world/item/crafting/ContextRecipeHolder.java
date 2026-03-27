package com.mohistmc.silkard.injected.world.item.crafting;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextRecipeHolder {

    default org.bukkit.inventory.Recipe toBukkitRecipe() {
        throw new ContextStateException("Not implemented");
    }
}
