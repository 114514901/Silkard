package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.TransientCraftingContainer;
import org.bukkit.craftbukkit.inventory.CraftInventoryCrafting;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(CraftingMenu.class)
public abstract class MixinCraftingMenu extends AbstractContainerMenu {

    @Shadow @Final public TransientCraftingContainer craftSlots;
    @Shadow @Final public ResultContainer resultSlots;
    @Shadow @Final private Player player;

    // CraftBukkit start
    @Unique
    private CraftInventoryView bukkitEntity = null;

    protected MixinCraftingMenu(@Nullable MenuType<?> menuType, int containerId) {
        super(menuType, containerId);
    }

    @Override
    public CraftInventoryView getBukkitView() {
        if (bukkitEntity != null) {
            return bukkitEntity;
        }

        CraftInventoryCrafting inventory = new CraftInventoryCrafting(this.craftSlots, this.resultSlots);
        bukkitEntity = new CraftInventoryView(this.player.getBukkitEntity(), inventory, (CraftingMenu) (Object) this);
        return bukkitEntity;
    }
    // CraftBukkit end
}
