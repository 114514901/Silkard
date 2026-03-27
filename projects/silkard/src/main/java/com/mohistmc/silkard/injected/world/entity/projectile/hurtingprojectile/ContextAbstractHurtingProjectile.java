package com.mohistmc.silkard.injected.world.entity.projectile.hurtingprojectile;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAbstractHurtingProjectile {

    default void setDirection(double d3, double d4, double d5) {
        throw new ContextStateException("Not implemented");
    }

    default float silkard$bukkitYield() {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$isIncendiary() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setBukkitYield(float yield) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setIsIncendiary(boolean incendiary) {
        throw new ContextStateException("Not implemented");
    }
}
