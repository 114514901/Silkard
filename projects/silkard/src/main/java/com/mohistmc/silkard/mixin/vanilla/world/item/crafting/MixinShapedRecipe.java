package com.mohistmc.silkard.mixin.vanilla.world.item.crafting;

import com.mohistmc.silkard.injected.world.item.crafting.ContextShapedRecipe;
import net.minecraft.world.item.crafting.ShapedRecipe;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ShapedRecipe.class)
public class MixinShapedRecipe implements ContextShapedRecipe {
}
