package com.mohistmc.silkard.mixin.vanilla.util;

import com.mohistmc.silkard.injected.util.ContextTickThrottler;
import net.minecraft.util.TickThrottler;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(TickThrottler.class)
public class MixinTickThrottler implements ContextTickThrottler {
}
