package com.mohistmc.silkard.mixin.vanilla.world.level.chunk;

import com.mohistmc.silkard.injected.world.level.chunk.ContextLevelChunk;
import net.minecraft.world.level.chunk.LevelChunk;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(LevelChunk.class)
public class MixinLevelChunk implements ContextLevelChunk {
}
