package com.mohistmc.silkard.injected.world.food;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

public interface ContextFoodData {

    default int silkard$saturatedRegenRate() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setSaturatedRegenRate(int saturatedRegenRate) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$unsaturatedRegenRate() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setUnsaturatedRegenRate(int unsaturatedRegenRate) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$starvationRate() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setStarvationRate(int starvationRate) {
        throw new ContextStateException("Not implemented");
    }

    default Player getEntityhuman() {
        throw new ContextStateException("Not implemented");
    }

    default void setEntityhuman(Player entityhuman) {
        throw new ContextStateException("Not implemented");
    }

    default void eat(ItemStack itemstack, FoodProperties foodinfo) {
        throw new ContextStateException("Not implemented");
    }

    default void pushEatStack(ItemStack stack) {
        throw new ContextStateException("Not implemented");
    }
}
