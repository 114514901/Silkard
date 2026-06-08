package com.mohistmc.silkard.mixin.vanilla.world.level.storage;

import com.mohistmc.silkard.injected.world.level.storage.ContextDerivedLevelData;
import net.minecraft.world.level.storage.DerivedLevelData;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(DerivedLevelData.class)
public class MixinDerivedLevelData implements ContextDerivedLevelData {
}
