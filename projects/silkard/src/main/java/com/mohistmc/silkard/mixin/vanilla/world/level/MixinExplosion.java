package com.mohistmc.silkard.mixin.vanilla.world.level;

import com.mohistmc.silkard.injected.world.level.ContextExplosion;
import net.minecraft.world.level.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Explosion.class)
public class MixinExplosion implements ContextExplosion {

    @Unique
    public float yield;

    @Unique
    public boolean wasCanceled;

    @Override
    public float silkard$getYield() {
        return yield;
    }

    @Override
    public void silkard$setYield(float yield) {
        this.yield = yield;
    }

    @Override
    public boolean silkard$wasCanceled() {
        return wasCanceled;
    }

    @Override
    public void silkard$wasCanceled(boolean wasCanceled) {
        this.wasCanceled = wasCanceled;
    }
}
