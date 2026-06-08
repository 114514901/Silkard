package com.mohistmc.silkard.mixin.vanilla.commands;

import com.mohistmc.silkard.injected.commands.ContextCommandSource;
import net.minecraft.commands.CommandSource;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(CommandSource.class)
public interface MixinCommandSource extends ContextCommandSource {
}
