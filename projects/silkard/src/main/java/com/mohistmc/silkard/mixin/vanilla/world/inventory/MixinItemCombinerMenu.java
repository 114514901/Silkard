package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import net.minecraft.world.inventory.ItemCombinerMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemCombinerMenu.class)
public abstract class MixinItemCombinerMenu {

    @Shadow
    public abstract boolean silkard$checkReachable();

    @Inject(method = "stillValid", at = @At("HEAD"), cancellable = true)
    public void silkard$stillValid(net.minecraft.world.entity.player.Player player, CallbackInfoReturnable<Boolean> cir) {
        if (!silkard$checkReachable()) {
            cir.setReturnValue(true);
        }
    }
}
