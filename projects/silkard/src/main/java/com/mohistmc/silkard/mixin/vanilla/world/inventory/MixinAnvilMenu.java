package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import com.mohistmc.silkard.injected.world.inventory.ContextAnvilMenu;
import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(AnvilMenu.class)
public class MixinAnvilMenu implements ContextAnvilMenu {

    // CraftBukkit start
    @Unique
    public static final int DEFAULT_DENIED_COST = -1;

    @Unique
    public int maximumRepairCost = 40;
    // CraftBukkit end

    @Override
    public int silkard$getDeniedCost() {
        return DEFAULT_DENIED_COST;
    }

    @Override
    public int silkard$maximumRepairCost() {
        return maximumRepairCost;
    }

    @Override
    public void silkard$maximumRepairCost(int maximumRepairCost) {
        this.maximumRepairCost = maximumRepairCost;
    }
}
