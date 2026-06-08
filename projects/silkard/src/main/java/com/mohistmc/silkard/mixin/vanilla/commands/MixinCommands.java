package com.mohistmc.silkard.mixin.vanilla.commands;

import com.mohistmc.silkard.injected.commands.ContextCommands;
import net.minecraft.commands.Commands;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Commands.class)
public class MixinCommands implements ContextCommands {
}
