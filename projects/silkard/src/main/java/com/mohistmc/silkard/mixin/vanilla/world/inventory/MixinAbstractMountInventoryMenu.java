package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.AbstractMountInventoryMenu;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.bukkit.inventory.InventoryView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(AbstractMountInventoryMenu.class)
public abstract class MixinAbstractMountInventoryMenu {

    // @formatter:off
    @Shadow protected Container mountContainer;
    // @formatter:on

    // CraftBukkit start
    @Unique
    CraftInventoryView bukkitEntity;

    @Unique
    Inventory player;

    public InventoryView getBukkitView() {
        if (bukkitEntity != null) {
            return bukkitEntity;
        }
        return bukkitEntity = new CraftInventoryView(player.player.getBukkitEntity(), mountContainer.getOwner().getInventory(), (AbstractContainerMenu) (Object) this);
    }
    // CraftBukkit end
}
