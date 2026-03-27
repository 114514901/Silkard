package com.mohistmc.silkard.injected.world.entity.vehicle.minecart;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.util.Vector;

public interface ContextAbstractMinecart {

    default double silkard$powRailAccelMult() {
        throw new ContextStateException("Not implemented");
    }

    default double silkard$maxSpeed() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setPowRailAccelMult(double powRailAccelMult) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMaxSpeed(double maxSpeed) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$slowWhenEmpty() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setSlowWhenEmpty(boolean slowWhenEmpty) {
        throw new ContextStateException("Not implemented");
    }

    default Vector getFlyingVelocityMod() {
        throw new ContextStateException("Not implemented");
    }

    default void setFlyingVelocityMod(Vector flying) {
        throw new ContextStateException("Not implemented");
    }

    default Vector getDerailedVelocityMod() {
        throw new ContextStateException("Not implemented");
    }

    default void setDerailedVelocityMod(Vector derailed) {
        throw new ContextStateException("Not implemented");
    }
}
