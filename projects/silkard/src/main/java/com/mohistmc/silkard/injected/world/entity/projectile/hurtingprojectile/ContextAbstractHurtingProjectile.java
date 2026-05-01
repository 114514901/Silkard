package com.mohistmc.silkard.injected.world.entity.projectile.hurtingprojectile;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAbstractHurtingProjectile {

    default float silkard$bukkitYield() {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$isIncendiary() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$bukkitYield(float yield) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$isIncendiary(boolean incendiary) {
        throw new ContextStateException("Not implemented");
    }
}
