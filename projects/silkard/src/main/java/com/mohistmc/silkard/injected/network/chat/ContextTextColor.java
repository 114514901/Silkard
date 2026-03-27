package com.mohistmc.silkard.injected.network.chat;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.ChatFormatting;

public interface ContextTextColor {

    default ChatFormatting silkard$format() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setFormat(ChatFormatting format) {
        throw new ContextStateException("Not implemented");
    }
}
