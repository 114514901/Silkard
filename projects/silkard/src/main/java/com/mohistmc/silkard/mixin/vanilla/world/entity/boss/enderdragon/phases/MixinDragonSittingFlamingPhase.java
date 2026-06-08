package com.mohistmc.silkard.mixin.vanilla.world.entity.boss.enderdragon.phases;

import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonSittingFlamingPhase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(DragonSittingFlamingPhase.class)
public class MixinDragonSittingFlamingPhase {

    @Redirect(method = "end", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/AreaEffectCloud;discard()V"))
    private void silkard_discard(AreaEffectCloud cloud) {
        cloud.discard(org.bukkit.event.entity.EntityRemoveEvent.Cause.DESPAWN);
    }
}
