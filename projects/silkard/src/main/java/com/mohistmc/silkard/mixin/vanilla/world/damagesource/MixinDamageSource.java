package com.mohistmc.silkard.mixin.vanilla.world.damagesource;

import com.mohistmc.silkard.injected.world.damagesource.ContextDamageSource;
import net.minecraft.world.damagesource.DamageSource;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(DamageSource.class)
public class MixinDamageSource implements ContextDamageSource {
}
