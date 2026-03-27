package com.mohistmc.silkard.injected.world.level.block.entity;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.List;
import org.bukkit.entity.HumanEntity;

public interface ContextShulkerBoxBlockEntity {

    default List<HumanEntity> silkard$transaction() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setTransaction(List<HumanEntity> transaction) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$opened() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setOpened(boolean opened) {
        throw new ContextStateException("Not implemented");
    }
}
