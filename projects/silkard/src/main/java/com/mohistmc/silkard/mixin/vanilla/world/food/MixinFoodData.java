package com.mohistmc.silkard.mixin.vanilla.world.food;

import com.mohistmc.silkard.injected.world.food.ContextFoodData;
import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/5/1 18:37
 */
@Mixin(FoodData.class)
public class MixinFoodData implements ContextFoodData {

    @Shadow public int foodLevel;

    @Shadow
    private void add(int food, float saturation) {}

    // CraftBukkit start
    public int saturatedRegenRate = 10;
    public int unsaturatedRegenRate = 80;
    public int starvationRate = 80;
    // CraftBukkit end

    @Override
    public int silkard$saturatedRegenRate() {
        return saturatedRegenRate;
    }

    @Override
    public void silkard$saturatedRegenRate(int saturatedRegenRate) {
        this.saturatedRegenRate = saturatedRegenRate;
    }

    @Override
    public int silkard$unsaturatedRegenRate() {
        return unsaturatedRegenRate;
    }

    @Override
    public void silkard$unsaturatedRegenRate(int unsaturatedRegenRate) {
        this.unsaturatedRegenRate = unsaturatedRegenRate;
    }

    @Override
    public int silkard$starvationRate() {
        return starvationRate;
    }

    @Override
    public void silkard$starvationRate(int starvationRate) {
        this.starvationRate = starvationRate;
    }

    @Override
    public void eat(FoodProperties foodproperties, ItemStack itemstack, ServerPlayer serverplayer) {
        int oldFoodLevel = foodLevel;

        org.bukkit.event.entity.FoodLevelChangeEvent event = org.bukkit.craftbukkit.event.CraftEventFactory.callFoodLevelChangeEvent(serverplayer, foodproperties.nutrition() + oldFoodLevel, itemstack);

        if (!event.isCancelled()) {
            this.add(event.getFoodLevel() - oldFoodLevel, foodproperties.saturation());
        }

        serverplayer.getBukkitEntity().sendHealthUpdate();
    }
}
