package com.mohistmc.silkard.mixin.vanilla.world.level.chunk;

import com.mohistmc.silkard.injected.world.level.chunk.ContextLevelChunk;
import net.minecraft.world.level.chunk.LevelChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(LevelChunk.class)
public abstract class MixinLevelChunk implements ContextLevelChunk {

    // CraftBukkit start
    @Unique
    public boolean mustNotSave;

    @Unique
    public boolean needsDecoration;
    // CraftBukkit end

    @Override
    public void loadCallback() {
    }

    @Override
    public void unloadCallback() {
    }
}
