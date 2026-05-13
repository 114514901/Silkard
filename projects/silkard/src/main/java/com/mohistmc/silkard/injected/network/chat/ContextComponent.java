package com.mohistmc.silkard.injected.network.chat;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.Iterator;
import java.util.stream.Stream;
import net.minecraft.network.chat.Component;
import org.jspecify.annotations.NonNull;

public interface ContextComponent extends Iterable<Component> {

    default Stream<Component> stream() {
        throw new ContextStateException("Not implemented");
    }

    default @NonNull Iterator<Component> iterator() {
        throw new ContextStateException("Not implemented");
    }
}
