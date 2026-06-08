package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import com.mohistmc.silkard.injected.world.inventory.ContextTransientCraftingContainer;
import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.TransientCraftingContainer;
import net.minecraft.world.item.ItemStack;
import org.bukkit.event.inventory.InventoryType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(TransientCraftingContainer.class)
public abstract class MixinTransientCraftingContainer implements ContextTransientCraftingContainer {

    // @formatter:off
    @Shadow private NonNullList<ItemStack> items;
    // @formatter:on

    // CraftBukkit start - add fields
    @Unique
    public Container resultInventory;

    @Unique
    private Player owner;
    // CraftBukkit end

    @Override
    public InventoryType getInvType() {
        return items.size() == 4 ? InventoryType.CRAFTING : InventoryType.WORKBENCH;
    }

    @Override
    public void silkard$setResultInventory(Container resultInventory) {
        this.resultInventory = resultInventory;
    }

    @Override
    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
