package com.mohistmc.silkard.injected.world.food;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

public interface ContextFoodData {

    default int silkard$saturatedRegenRate() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$saturatedRegenRate(int saturatedRegenRate) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$unsaturatedRegenRate() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$unsaturatedRegenRate(int unsaturatedRegenRate) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$starvationRate() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$starvationRate(int starvationRate) {
        throw new ContextStateException("Not implemented");
    }

    default void eat(FoodProperties foodproperties, ItemStack itemstack, ServerPlayer serverplayer) {
        throw new ContextStateException("Not implemented");
    }
}
