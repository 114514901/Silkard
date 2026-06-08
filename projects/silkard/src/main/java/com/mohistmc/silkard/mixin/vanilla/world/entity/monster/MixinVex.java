package com.mohistmc.silkard.mixin.vanilla.world.entity.monster;

import net.minecraft.world.entity.monster.Vex;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Vex.class)
public class MixinVex {

    @Redirect(method = "readAdditionalSaveData", at = @At(value = "INVOKE", target = "Ljava/util/Optional;orElse(Ljava/lang/Object;)Ljava/lang/Object;"))
    private Object silkard_orElse(Optional<Object> optional, Object other) {
        return optional.orElse(null); // CraftBukkit - decompile error
    }
}
