package com.mohistmc.silkard.mixin.vanilla.world.level.chunk.storage;

import com.mohistmc.silkard.injected.world.level.chunk.storage.ContextRegionFileStorage;
import net.minecraft.world.level.chunk.storage.RegionFileStorage;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(RegionFileStorage.class)
public class MixinRegionFileStorage implements ContextRegionFileStorage {
}
