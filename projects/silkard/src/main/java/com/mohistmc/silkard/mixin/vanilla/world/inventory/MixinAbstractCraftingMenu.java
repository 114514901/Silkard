package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractCraftingMenu;
import com.mohistmc.silkard.injected.world.inventory.ContextTransientCraftingContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.TransientCraftingContainer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractCraftingMenu.class)
public abstract class MixinAbstractCraftingMenu {

    @Shadow @Final public TransientCraftingContainer craftSlots;
    @Shadow @Final public ResultContainer resultSlots;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void silkard$init(MenuType<?> menuType, int containerId, int width, int height, Inventory playerInventory, CallbackInfo ci) {
        ((ContextTransientCraftingContainer) this.craftSlots).silkard$setResultInventory(this.resultSlots);
    }
}
