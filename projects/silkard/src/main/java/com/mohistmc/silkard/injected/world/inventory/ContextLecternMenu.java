package com.mohistmc.silkard.injected.world.inventory;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.player.Inventory;

public interface ContextLecternMenu {

    default void silkard$setPlayerInventory(Inventory playerInventory) {
        throw new ContextStateException("Not implemented");
    }
}
