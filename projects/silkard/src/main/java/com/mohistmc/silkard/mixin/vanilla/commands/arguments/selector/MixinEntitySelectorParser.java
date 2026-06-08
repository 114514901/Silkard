package com.mohistmc.silkard.mixin.vanilla.commands.arguments.selector;

import com.mohistmc.silkard.injected.commands.arguments.selector.ContextEntitySelectorParser;
import net.minecraft.commands.arguments.selector.EntitySelectorParser;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(EntitySelectorParser.class)
public class MixinEntitySelectorParser implements ContextEntitySelectorParser {
}
