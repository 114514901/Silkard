package com.mohistmc.silkard.injected.server.rcon;

import com.mohistmc.silkard.util.ContextStateException;
import java.net.SocketAddress;
import net.minecraft.commands.CommandSourceStack;

public interface ContextRconConsoleSource {

    default SocketAddress silkard$socketAddress() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setSocketAddress(SocketAddress socketAddress) {
        throw new ContextStateException("Not implemented");
    }

    default void sendMessage(String message) {
        throw new ContextStateException("Not implemented");
    }

    default org.bukkit.command.CommandSender getBukkitSender(CommandSourceStack wrapper) {
        throw new ContextStateException("Not implemented");
    }
}
