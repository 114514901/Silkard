package com.mohistmc.silkard.injected.world.entity.projectile;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.projectile.ProjectileDeflection;
import net.minecraft.world.phys.HitResult;

public interface ContextProjectile {

    default boolean hitCancelled() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setHitCancelled(boolean cancelled) {
        throw new ContextStateException("Not implemented");
    }

    default ProjectileDeflection preHitTargetOrDeflectSelf(HitResult movingobjectposition) {
        throw new ContextStateException("Not implemented");
    }
}
