package com.mohistmc.silkard.injected.world.level.block.entity;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.List;
import org.bukkit.entity.HumanEntity;

public interface ContextShulkerBoxBlockEntity {

    default boolean silkard_opened() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_opened(boolean opened) {
        throw new ContextStateException("Not implemented");
    }
}
