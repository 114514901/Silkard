package com.mohistmc.silkard.mixin.vanilla.world.entity;

import com.mohistmc.silkard.injected.world.entity.ContextAgeableMob;
import net.minecraft.world.entity.AgeableMob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(AgeableMob.class)
public class MixinAgeableMob implements ContextAgeableMob {

    @Unique
    public boolean ageLocked;

    @Override
    public boolean silkard$ageLocked() {
        return ageLocked;
    }

    @Override
    public void silkard$setAgeLocked(boolean ageLocked) {
        this.ageLocked = ageLocked;
    }
}
