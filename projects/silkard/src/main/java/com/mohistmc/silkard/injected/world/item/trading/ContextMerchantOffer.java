package com.mohistmc.silkard.injected.world.item.trading;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.item.trading.MerchantOffer;
import org.bukkit.craftbukkit.inventory.CraftMerchantRecipe;

public interface ContextMerchantOffer {

    default CraftMerchantRecipe asBukkit() {
        throw new ContextStateException("Not implemented");
    }

    default MerchantOffer bukkit(CraftMerchantRecipe bukkit) {
        throw new ContextStateException("Not implemented");
    }
}
