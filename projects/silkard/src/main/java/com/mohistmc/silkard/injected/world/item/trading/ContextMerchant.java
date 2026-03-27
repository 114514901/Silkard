package com.mohistmc.silkard.injected.world.item.trading;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.craftbukkit.inventory.CraftMerchant;

public interface ContextMerchant {

    default CraftMerchant getCraftMerchant() {
        throw new ContextStateException("Not implemented");
    }
}
