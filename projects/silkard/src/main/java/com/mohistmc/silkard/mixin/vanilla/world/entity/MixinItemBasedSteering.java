package com.mohistmc.silkard.mixin.vanilla.world.entity;

import com.mohistmc.silkard.injected.world.entity.ContextItemBasedSteering;
import net.minecraft.world.entity.ItemBasedSteering;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ItemBasedSteering.class)
public class MixinItemBasedSteering implements ContextItemBasedSteering {
}
