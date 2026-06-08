package com.mohistmc.silkard.mixin.vanilla.world.entity.monster;

import com.mohistmc.silkard.injected.world.entity.projectile.hurtingprojectile.ContextAbstractHurtingProjectile;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.projectile.hurtingprojectile.LargeFireball;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Ghast.class)
public class MixinGhast {

    @Redirect(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/projectile/hurtingprojectile/LargeFireball;setPos(DDD)V"))
    private void silkard$aiStep(LargeFireball instance, double x, double y, double z, Ghast ghast, Vec3 vec3) {
        float power = ghast.getExplosionPower();
        instance.explosionPower = (int) power;
        ((ContextAbstractHurtingProjectile) instance).silkard$bukkitYield(power);
        instance.setPos(x, y, z);
    }
}
