package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import com.mohistmc.silkard.injected.world.inventory.ContextLecternMenu;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.LecternMenu;
import net.minecraft.world.inventory.MenuType;
import org.bukkit.craftbukkit.inventory.CraftInventoryLectern;
import org.bukkit.craftbukkit.inventory.view.CraftLecternView;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/5/13 21:30
 */
@Mixin(LecternMenu.class)
public abstract class MixinLecternMenu extends AbstractContainerMenu implements ContextLecternMenu {

    @Shadow @Final private Container lectern;

    protected MixinLecternMenu(@Nullable MenuType<?> menuType, int containerId) {
        super(menuType, containerId);
    }

    // CraftBukkit start
    private CraftLecternView bukkitEntity = null;
    private org.bukkit.entity.Player player;

    @Override
    public CraftLecternView getBukkitView() {
        if (bukkitEntity != null) {
            return bukkitEntity;
        }

        CraftInventoryLectern inventory = new CraftInventoryLectern(this.lectern);
        bukkitEntity = new CraftLecternView(this.player, inventory, (LecternMenu) (Object) this);
        return bukkitEntity;
    }
    // CraftBukkit end

    @Override
    public LecternMenu silkard$player(Inventory playerInventory) {
        player = (org.bukkit.entity.Player) playerInventory.player.getBukkitEntity(); // CraftBukkit
        return (LecternMenu) (Object) this;
    }
}
