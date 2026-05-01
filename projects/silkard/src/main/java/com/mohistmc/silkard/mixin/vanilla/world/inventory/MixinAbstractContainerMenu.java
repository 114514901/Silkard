package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import com.mohistmc.silkard.bukkit.inventory.SilkardModsInventory;
import com.mohistmc.silkard.injected.world.inventory.ContextAbstractContainerMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.bukkit.inventory.InventoryView;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/5/1 18:43
 */
@Mixin(AbstractContainerMenu.class)
public class MixinAbstractContainerMenu implements ContextAbstractContainerMenu {

    @Shadow @Final
    @Nullable
    private MenuType<?> menuType;

    // CraftBukkit start
    public boolean checkReachable = true;
    // Youer start
    public InventoryView bukkitView ;
    public Player containerOwner = null;

    @Override
    public Player containerOwner() {
        return containerOwner;
    }

    @Override
    public void containerOwner(Player containerOwner) {
        this.containerOwner = containerOwner;
    }

    @Override
    public InventoryView getBukkitView(){
        if (bukkitView == null && containerOwner != null) {
            org.bukkit.inventory.Inventory view = new CraftInventory(new SilkardModsInventory((AbstractContainerMenu)(Object)this, containerOwner));
            //view.getType().setMods(true);
            bukkitView = new CraftInventoryView<>(containerOwner.getBukkitEntity(), view, (AbstractContainerMenu)(Object)this);
        }
        return bukkitView;
    }

    @Override
    public InventoryView getBukkitView(AbstractContainerMenu other){
        if (other.getBukkitView() == null && other.containerOwner() != null) {
            org.bukkit.inventory.Inventory view = new CraftInventory(new SilkardModsInventory(other, containerOwner));
            //view.getType().setMods(true);
            return new CraftInventoryView<>(other.containerOwner().getBukkitEntity(), view, other);
        }
        return other.getBukkitView();
    }

    @Override
    public void transferTo(AbstractContainerMenu other, CraftHumanEntity player) {
        other.containerOwner(player.getHandle());
        this.containerOwner = player.getHandle();
        InventoryView source = this.getBukkitView(), destination = other.getBukkitView();
        if (destination == null) {
            destination = this.getBukkitView(other);
        }
        if (source == null) {
            org.bukkit.inventory.Inventory view = new CraftInventory(new SilkardModsInventory((AbstractContainerMenu)(Object)this, containerOwner));
            //view.getType().setMods(true);
            source = new CraftInventoryView<>(containerOwner.getBukkitEntity(), view, (AbstractContainerMenu)(Object)this);
        }
        if (source.getPlayer() == null) {
            source.setPlayer(player);
        }
        ((CraftInventory) source.getTopInventory()).getInventory().onClose(player);
        ((CraftInventory) source.getBottomInventory()).getInventory().onClose(player);
        ((CraftInventory) destination.getTopInventory()).getInventory().onOpen(player);
        ((CraftInventory) destination.getBottomInventory()).getInventory().onOpen(player);
    }
    @Nullable
    private Component title = null;
    @Override
    public final Component getTitle() {
        if (this.title == null) {
            if (this.menuType != null) {
                var key = BuiltInRegistries.MENU.getKey(this.menuType);
                if (key == null) {
                    this.title = Component.literal(this.toString());
                } else {
                    this.title = Component.translatable(key.toString());
                }
            } else {
                this.title = Component.literal(this.toString());
            }
        }
        return this.title;
    }
    @Override
    public final void setTitle(Component title) {
        if (this.title == null) {
            if (title == null) {
                this.title = getTitle();
            } else {
                this.title = title;
            }
        }
    }
    protected boolean opened;
    @Override
    public void startOpen() {
        this.opened = true;
    }
    // CraftBukkit end

    @Override
    public boolean silkard$checkReachable() {
        return checkReachable;
    }

    @Override
    public void silkard$checkReachable(boolean checkReachable) {
        this.checkReachable = checkReachable;
    }
}
