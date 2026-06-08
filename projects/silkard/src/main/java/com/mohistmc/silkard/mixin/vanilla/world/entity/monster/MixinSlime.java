package com.mohistmc.silkard.mixin.vanilla.world.entity.monster;

import com.mohistmc.silkard.injected.world.entity.monster.ContextSlime;
import net.minecraft.world.entity.monster.Slime;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Slime.class)
public class MixinSlime implements ContextSlime {

    @Unique
    public boolean canWander;

    @Override
    public boolean canWander() {
        return canWander;
    }

    @Override
    public void setWander(boolean canWander) {
        this.canWander = canWander;
    }
}
