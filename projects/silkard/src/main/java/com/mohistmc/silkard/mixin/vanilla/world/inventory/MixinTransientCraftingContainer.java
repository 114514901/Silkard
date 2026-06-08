package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import com.mohistmc.silkard.injected.world.inventory.ContextTransientCraftingContainer;
import net.minecraft.world.inventory.TransientCraftingContainer;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(TransientCraftingContainer.class)
public class MixinTransientCraftingContainer implements ContextTransientCraftingContainer {
}
