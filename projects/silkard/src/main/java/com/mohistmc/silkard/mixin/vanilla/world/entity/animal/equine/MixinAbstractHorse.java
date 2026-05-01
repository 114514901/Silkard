package com.mohistmc.silkard.mixin.vanilla.world.entity.animal.equine;

import com.mohistmc.silkard.injected.world.entity.animal.equine.ContextAbstractHorse;
import net.minecraft.world.entity.animal.equine.AbstractHorse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/5/1 16:57
 */
@Mixin(AbstractHorse.class)
public class MixinAbstractHorse implements ContextAbstractHorse {

    @Unique
    public int maxDomestication = 100; // CraftBukkit - store max domestication value

    public int silkard$maxDomestication() {
        return maxDomestication;
    }

    public void silkard$maxDomestication(int maxDomestication) {
        this.maxDomestication = maxDomestication;
    }
}
