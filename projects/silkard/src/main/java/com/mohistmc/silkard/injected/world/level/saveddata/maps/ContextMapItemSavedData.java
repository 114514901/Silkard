package com.mohistmc.silkard.injected.world.level.saveddata.maps;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.UUID;
import net.minecraft.world.level.saveddata.maps.MapId;
import org.bukkit.craftbukkit.map.CraftMapView;

public interface ContextMapItemSavedData {

    default CraftMapView silkard_mapView() {
        throw new ContextStateException("Not implemented");
    }

    default UUID silkard_uniqueId() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_uniqueId(UUID uuid) {
        throw new ContextStateException("Not implemented");
    }

    default MapId silkard_id() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_id(MapId id) {
        throw new ContextStateException("Not implemented");
    }
}
