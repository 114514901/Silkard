package com.mohistmc.silkard.injected.world.level.saveddata.maps;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.UUID;
import org.bukkit.craftbukkit.map.CraftMapView;

public interface ContextMapItemSavedData {

    default CraftMapView silkard$mapView() {
        throw new ContextStateException("Not implemented");
    }

    default UUID silkard$uniqueId() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setUniqueId(UUID uuid) {
        throw new ContextStateException("Not implemented");
    }

    default String silkard$id() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setId(String id) {
        throw new ContextStateException("Not implemented");
    }
}
