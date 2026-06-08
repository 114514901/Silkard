package com.mohistmc.silkard.mixin.vanilla.world.entity;

import com.mohistmc.silkard.injected.world.entity.ContextLightningBolt;
import net.minecraft.world.entity.LightningBolt;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(LightningBolt.class)
public class MixinLightningBolt implements ContextLightningBolt {

    @Unique
    public boolean isSilent;

    @Override
    public boolean silkard$isSilent() {
        return isSilent;
    }

    @Override
    public void silkard$setIsSilent(boolean isSilent) {
        this.isSilent = isSilent;
    }
}
