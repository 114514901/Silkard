package com.mohistmc.silkard.injected.world.entity.vehicle.boat;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAbstractBoat {

    default double silkard_maxSpeed() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_maxSpeed(double maxSpeed) {
        throw new ContextStateException("Not implemented");
    }

    default double silkard_occupiedDeceleration() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_occupiedDeceleration(double occupiedDeceleration) {
        throw new ContextStateException("Not implemented");
    }

    default double silkard_unoccupiedDeceleration() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_unoccupiedDeceleration(double occupiedDeceleration) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard_landBoats() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_landBoats(boolean landBoats) {
        throw new ContextStateException("Not implemented");
    }
}
