package com.mohistmc.silkard.mixin.vanilla.world.level.entity;

import com.mohistmc.silkard.injected.world.level.entity.ContextEntityAccess;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.entity.EntityAccess;
import org.bukkit.event.entity.EntityRemoveEvent;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityAccess.class)
public interface MixinEntityAccess extends ContextEntityAccess {

}
