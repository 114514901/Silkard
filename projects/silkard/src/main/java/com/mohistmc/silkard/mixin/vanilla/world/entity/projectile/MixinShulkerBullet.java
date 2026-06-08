package com.mohistmc.silkard.mixin.vanilla.world.entity.projectile;

import com.mohistmc.silkard.injected.world.entity.projectile.ContextShulkerBullet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ShulkerBullet.class)
public class MixinShulkerBullet implements ContextShulkerBullet {

    @Shadow
    private Entity finalTarget;

    @Override
    public Entity getTarget() {
        return finalTarget;
    }

    @Override
    public void setTarget(Entity e) {
        this.finalTarget = e;
    }
}
