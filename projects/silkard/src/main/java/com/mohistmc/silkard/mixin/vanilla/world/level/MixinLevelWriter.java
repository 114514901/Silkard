package com.mohistmc.silkard.mixin.vanilla.world.level;

import com.mohistmc.silkard.injected.world.level.ContextLevelWriter;
import net.minecraft.world.level.LevelWriter;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(LevelWriter.class)
public interface MixinLevelWriter extends ContextLevelWriter {
}
