package com.mohistmc.silkard.mixin.vanilla.util.datafix.fixes;

import net.minecraft.util.datafix.fixes.ItemStackMapIdFix;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ItemStackMapIdFix.class)
public class MixinItemStackMapIdFix {

    @Inject(method = "fixItemStack", at = @At("HEAD"))
    private void silkard_fixItemStack(CallbackInfo ci) {
        // CraftBukkit
    }
}
