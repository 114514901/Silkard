package com.mohistmc.silkard.injected.network.chat;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.Iterator;
import java.util.stream.Stream;
import net.minecraft.network.chat.Component;

public interface ContextComponent {

    default Stream<Component> silkard$stream() {
        throw new ContextStateException("Not implemented");
    }

    default Iterator<Component> silkard$iterator() {
        throw new ContextStateException("Not implemented");
    }
}
