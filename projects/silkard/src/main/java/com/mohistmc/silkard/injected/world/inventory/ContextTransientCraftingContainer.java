package com.mohistmc.silkard.injected.world.inventory;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import org.bukkit.event.inventory.InventoryType;

public interface ContextTransientCraftingContainer {

    default InventoryType getInvType() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setResultInventory(Container resultInventory) {
        throw new ContextStateException("Not implemented");
    }


    default void setOwner(Player owner) {
        throw new ContextStateException("Not implemented");
    }
}
