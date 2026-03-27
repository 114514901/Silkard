package com.mohistmc.silkard.injected.world.item.crafting;

import com.mohistmc.silkard.util.ContextStateException;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.Map;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeType;

public interface ContextRecipeManager {

    default Map<RecipeType<?>, Object2ObjectLinkedOpenHashMap<Identifier, RecipeHolder<?>>> silkard$recipesCB() {
        throw new ContextStateException("Not implemented");
    }

    default void addRecipe(RecipeHolder<?> irecipe) {
        throw new ContextStateException("Not implemented");
    }

    default void clearRecipes() {
        throw new ContextStateException("Not implemented");
    }

   default boolean removeRecipe(ResourceKey<Recipe<?>> minecraft) {
       throw new ContextStateException("Not implemented");
   }

   default void finalizeRecipeLoading() {
       throw new ContextStateException("Not implemented");
   }
}
