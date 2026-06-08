package com.mohistmc.silkard.mixin.vanilla.world.entity.monster;

import net.minecraft.world.entity.monster.Endermite;
import org.bukkit.event.entity.EntityRemoveEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Endermite.class)
public class MixinEndermite {

    @Redirect(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/monster/Endermite;discard()V"))
    private void silkard$aiStep(Endermite instance) {
        instance.discard(EntityRemoveEvent.Cause.DESPAWN);
    }
}
