package com.mohistmc.silkard.mixin.vanilla.world.entity.decoration;

import com.mohistmc.silkard.injected.world.entity.decoration.ContextArmorStand;
import net.minecraft.world.entity.decoration.ArmorStand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ArmorStand.class)
public class MixinArmorStand implements ContextArmorStand {

    @Unique
    public boolean canMove = true;

    @Override
    public boolean silkard$canMove() {
        return canMove;
    }

    @Override
    public void silkard$setCanMove(boolean canMove) {
        this.canMove = canMove;
    }
}
