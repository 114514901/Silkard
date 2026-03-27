package com.mohistmc.silkard.mixin.vanilla.world.entity;

import com.mohistmc.silkard.injected.world.entity.ContextEntity;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/3/28 05:14
 */
@Mixin(Entity.class)
public class MixinEntity implements ContextEntity {


    @Unique
    public boolean generation;

    @Override
    public boolean silkard_generation() {
       return generation;
    }

    @Override
    public void silkard_generation(boolean gen) {
       generation = gen;
    }

}
