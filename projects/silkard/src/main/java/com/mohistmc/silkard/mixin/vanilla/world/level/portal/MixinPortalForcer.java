package com.mohistmc.silkard.mixin.vanilla.world.level.portal;

import com.mohistmc.silkard.injected.world.level.portal.ContextPortalForcer;
import net.minecraft.world.level.portal.PortalForcer;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(PortalForcer.class)
public class MixinPortalForcer implements ContextPortalForcer {
}
