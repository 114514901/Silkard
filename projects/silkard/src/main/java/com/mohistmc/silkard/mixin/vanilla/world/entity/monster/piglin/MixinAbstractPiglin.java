package com.mohistmc.silkard.mixin.vanilla.world.entity.monster.piglin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.ConversionParams;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.piglin.AbstractPiglin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractPiglin.class)
public class MixinAbstractPiglin {

    @Redirect(method = "finishConversion", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/monster/piglin/AbstractPiglin;convertTo(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/entity/ConversionParams;Ljava/util/function/Consumer;)Lnet/minecraft/world/entity/LivingEntity;"))
    private <T extends net.minecraft.world.entity.LivingEntity> T silkard_convertTo(AbstractPiglin piglin, EntityType<T> type, ConversionParams params, java.util.function.Consumer<T> consumer) {
        return piglin.convertTo(type, params, consumer, org.bukkit.event.entity.EntityTransformEvent.TransformReason.PIGLIN_ZOMBIFIED, org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason.PIGLIN_ZOMBIFIED);
    }
}
