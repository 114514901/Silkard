package com.mohistmc.silkard.mixin.vanilla.server.level;

import com.mohistmc.silkard.injected.server.level.ContextChunkHolder;
import net.minecraft.server.level.ChunkHolder;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ChunkHolder.class)
public class MixinChunkHolder implements ContextChunkHolder {
}
