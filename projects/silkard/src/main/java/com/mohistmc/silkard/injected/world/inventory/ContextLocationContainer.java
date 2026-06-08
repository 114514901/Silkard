package com.mohistmc.silkard.injected.world.inventory;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.Location;

public interface ContextLocationContainer {

    default Location getLocation() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setLocation(Location location) {
        throw new ContextStateException("Not implemented");
    }
}
