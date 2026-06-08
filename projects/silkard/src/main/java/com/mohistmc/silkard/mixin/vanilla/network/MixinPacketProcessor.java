package com.mohistmc.silkard.mixin.vanilla.network;

import net.minecraft.network.PacketProcessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(PacketProcessor.class)
public class MixinPacketProcessor {

    @Inject(method = "process", at = @At("HEAD"))
    private void silkard_process(CallbackInfo ci) {
        // CraftBukkit - Don't handle sync packets for kicked players
    }
}
