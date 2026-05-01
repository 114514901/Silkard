package com.mohistmc.silkard.mixin.vanilla.world.entity.projectile.hurtingprojectile;

import com.mohistmc.silkard.injected.world.entity.projectile.hurtingprojectile.ContextAbstractHurtingProjectile;
import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.projectile.hurtingprojectile.AbstractHurtingProjectile;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/5/1 16:50
 */
@Mixin(AbstractHurtingProjectile.class)
public class MixinAbstractHurtingProjectile implements ContextAbstractHurtingProjectile {

    public float bukkitYield = 1; // CraftBukkit
    public boolean isIncendiary = true; // CraftBukkit

    public void setDirection(double d3, double d4, double d5) {
        throw new ContextStateException("Not implemented");
    }

    public float silkard$bukkitYield() {
        return bukkitYield;
    }

    public boolean silkard$isIncendiary() {
        return isIncendiary;
    }

    public void silkard$bukkitYield(float yield) {
        this.bukkitYield = yield;
    }

    public void silkard$isIncendiary(boolean incendiary) {
        this.isIncendiary = incendiary;
    }
}
