package com.mohistmc.silkard.mixin.vanilla.world.level.entity;

import com.mohistmc.silkard.injected.world.level.entity.ContextEntityAccess;
import net.minecraft.world.level.entity.EntityAccess;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(EntityAccess.class)
public interface MixinEntityAccess extends ContextEntityAccess {
}
