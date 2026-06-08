package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.CrafterMenu;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import org.bukkit.craftbukkit.inventory.CraftInventoryCrafter;
import org.bukkit.craftbukkit.inventory.view.CraftCrafterView;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(CrafterMenu.class)
public abstract class MixinCrafterMenu extends AbstractContainerMenu {

    @Shadow @Final private Player player;
    @Shadow @Final private CraftingContainer container;
    @Shadow @Final private ResultContainer resultContainer;
    @Shadow abstract void refreshRecipeResult();

    // CraftBukkit start
    @Unique
    private CraftCrafterView bukkitEntity = null;

    protected MixinCrafterMenu(@Nullable MenuType<?> menuType, int containerId) {
        super(menuType, containerId);
    }

    @Override
    public CraftCrafterView getBukkitView() {
        if (bukkitEntity != null) {
            return bukkitEntity;
        }

        CraftInventoryCrafter inventory = new CraftInventoryCrafter(this.container, this.resultContainer);
        bukkitEntity = new CraftCrafterView(this.player.getBukkitEntity(), inventory, (CrafterMenu) (Object) this);
        return bukkitEntity;
    }

    @Override
    public void startOpen() {
        super.startOpen();
        this.refreshRecipeResult();
    }
    // CraftBukkit end
}
