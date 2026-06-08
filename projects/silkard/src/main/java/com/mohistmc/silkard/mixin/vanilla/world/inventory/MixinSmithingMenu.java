package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.SmithingMenu;
import org.bukkit.craftbukkit.inventory.CraftInventorySmithing;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(SmithingMenu.class)
public abstract class MixinSmithingMenu extends AbstractContainerMenu {

    @Shadow @Final protected Container inputSlots;
    @Shadow @Final protected ResultContainer resultSlots;
    @Shadow @Final protected ContainerLevelAccess access;
    @Shadow @Final protected Player player;

    // CraftBukkit start
    @Unique
    private CraftInventoryView bukkitEntity;

    protected MixinSmithingMenu(@Nullable MenuType<?> menuType, int containerId) {
        super(menuType, containerId);
    }

    @Override
    public CraftInventoryView getBukkitView() {
        if (bukkitEntity != null) {
            return bukkitEntity;
        }

        CraftInventorySmithing inventory = new CraftInventorySmithing(
                access.getLocation(), this.inputSlots, this.resultSlots);
        bukkitEntity = new CraftInventoryView(this.player.getBukkitEntity(), inventory, (SmithingMenu) (Object) this);
        return bukkitEntity;
    }
    // CraftBukkit end
}
