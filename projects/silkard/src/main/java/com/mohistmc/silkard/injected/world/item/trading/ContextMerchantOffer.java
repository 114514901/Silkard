package com.mohistmc.silkard.injected.world.item.trading;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.craftbukkit.inventory.CraftMerchantRecipe;

public interface ContextMerchantOffer {

    default CraftMerchantRecipe asBukkit() {
        throw new ContextStateException("Not implemented");
    }

}
