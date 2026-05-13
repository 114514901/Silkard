package com.mohistmc.silkard.mixin.vanilla.world.entity;

import com.mohistmc.silkard.injected.world.entity.ContextMob;
import net.minecraft.world.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/4/2 20:01
 */
@Mixin(Mob.class)
public class MixinMob implements ContextMob {

    @Unique
    public boolean aware = true; // CraftBukkit

    @Override
    public boolean silkard_aware() {
        return aware;
    }

    @Override
    public void silkard_aware(boolean aware){
        this.aware = aware;
    }
}
