package com.mohistmc.silkard.mixin.vanilla.world.level;

import com.mohistmc.silkard.injected.world.level.ContextBlockGetter;
import net.minecraft.world.level.BlockGetter;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(BlockGetter.class)
public interface MixinBlockGetter extends ContextBlockGetter {
}
