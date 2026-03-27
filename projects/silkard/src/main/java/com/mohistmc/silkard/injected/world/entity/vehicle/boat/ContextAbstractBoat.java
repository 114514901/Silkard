package com.mohistmc.silkard.injected.world.entity.vehicle.boat;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAbstractBoat {

    default double silkard$maxSpeed() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMaxSpeed(double maxSpeed) {
        throw new ContextStateException("Not implemented");
    }

    default double silkard$occupiedDeceleration() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setOccupiedDeceleration(double occupiedDeceleration) {
        throw new ContextStateException("Not implemented");
    }

    default double silkard$unoccupiedDeceleration() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setUnoccupiedDeceleration(double occupiedDeceleration) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$landBoats() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setLandBoats(boolean landBoats) {
        throw new ContextStateException("Not implemented");
    }
}
