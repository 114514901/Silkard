package com.mohistmc.silkard.mixin.vanilla.world.item.enchantment.effects;

import net.minecraft.world.item.enchantment.effects.ReplaceBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ReplaceBlock.class)
public class MixinReplaceBlock {

    @Inject(method = "apply", at = @At("HEAD"))
    private void silkard_apply(CallbackInfo ci) {
        // CraftBukkit
    }
}
