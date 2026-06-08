package com.mohistmc.silkard.mixin.vanilla.world.entity.player;

import com.mohistmc.silkard.injected.world.entity.player.ContextInventory;
import net.minecraft.world.entity.player.Inventory;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Inventory.class)
public class MixinInventory implements ContextInventory {
}
