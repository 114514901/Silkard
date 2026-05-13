package com.mohistmc.silkard.injected.world.inventory;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.LecternMenu;

public interface ContextLecternMenu {

    default LecternMenu silkard$player(Inventory playerInventory) {
        throw new ContextStateException("Not implemented");
    }
}
