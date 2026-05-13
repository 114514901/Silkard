package com.mohistmc.silkard.mixin.vanilla.world.entity.vehicle.minecart;

import com.mohistmc.silkard.injected.world.entity.vehicle.minecart.ContextMinecartTNT;
import net.minecraft.world.entity.vehicle.minecart.MinecartTNT;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/5/1 18:22
 */
@Mixin(MinecartTNT.class)
public class MixinMinecartTNT implements ContextMinecartTNT {

    public boolean isIncendiary = false; // CraftBukkit - add field

    public boolean silkard$isIncendiary() {
        return isIncendiary;
    }

    public void silkard$isIncendiary(boolean isIncendiary) {
        this.isIncendiary = isIncendiary;
    }
}
