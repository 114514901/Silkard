package com.mohistmc.silkard.mixin.vanilla.advancements;

import com.mohistmc.silkard.injected.advancements.ContextAdvancementHolder;
import net.minecraft.advancements.AdvancementHolder;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(AdvancementHolder.class)
public class MixinAdvancementHolder implements ContextAdvancementHolder {
}
