package com.mohistmc.silkard.injected.world.entity.projectile;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.Entity;

public interface ContextShulkerBullet {

    default Entity getTarget() {
        throw new ContextStateException("Not implemented");
    }

    default void setTarget(Entity e) {
        throw new ContextStateException("Not implemented");
    }
}
