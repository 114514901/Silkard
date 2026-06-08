package com.mohistmc.silkard.mixin.vanilla.world.entity.monster;

import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Ghast.class)
public class MixinGhast {

    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/projectile/LargeFireball;setPos(DDD)V"))
    private void silkard$tick(LargeFireball instance, double x, double y, double z, Ghast ghast, Vec3 vec3) {
        instance.bukkitYield = instance.explosionPower = ghast.getExplosionPower();
        instance.setPos(x, y, z);
    }
}
