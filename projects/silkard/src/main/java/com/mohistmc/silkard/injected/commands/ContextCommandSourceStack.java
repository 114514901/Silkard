package com.mohistmc.silkard.injected.commands;

import com.mohistmc.silkard.util.ContextStateException;
import com.mojang.brigadier.tree.CommandNode;
import net.minecraft.commands.CommandSource;

public interface ContextCommandSourceStack {

    default void silkard$setSource(CommandSource source) {
        throw new ContextStateException("Not implemented");
    }

    default boolean hasPermission(int i, String bukkitPermission) {
        throw new ContextStateException("Not implemented");
    }

    default org.bukkit.command.CommandSender getBukkitSender() {
        throw new ContextStateException("Not implemented");
    }

    default CommandNode<?> silkard$currentCommand() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$currentCommand(CommandNode<?> node) {
        throw new ContextStateException("Not implemented");
    }
}
