package com.mohistmc.silkard.mixin.vanilla.world.item.crafting;

import com.mohistmc.silkard.injected.world.item.crafting.ContextRecipeHolder;
import net.minecraft.world.item.crafting.RecipeHolder;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(RecipeHolder.class)
public interface MixinRecipeHolder extends ContextRecipeHolder {
}
