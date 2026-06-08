package com.mohistmc.silkard.mixin.vanilla.world.entity.ai.memory;

import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(MemoryModuleType.class)
public class MixinMemoryModuleType {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void silkard_init(CallbackInfo ci) {
        // CraftBukkit - rawCodec field
    }
}
