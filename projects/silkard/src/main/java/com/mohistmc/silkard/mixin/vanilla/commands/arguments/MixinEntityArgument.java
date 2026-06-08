package com.mohistmc.silkard.mixin.vanilla.commands.arguments;

import com.mohistmc.silkard.injected.commands.arguments.ContextEntityArgument;
import net.minecraft.commands.arguments.EntityArgument;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(EntityArgument.class)
public class MixinEntityArgument implements ContextEntityArgument {
}
