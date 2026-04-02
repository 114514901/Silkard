package com.mohistmc.silkard.injected.world.level.levelgen.structure;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextStructureStart {

    default org.bukkit.event.world.AsyncStructureGenerateEvent.Cause silkard_generationEventCause() {
        throw new ContextStateException("Not implemented");
    }

    default org.bukkit.craftbukkit.persistence.DirtyCraftPersistentDataContainer silkard_persistentDataContainer() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_setGenerationEventCause(org.bukkit.event.world.AsyncStructureGenerateEvent.Cause generationEventCause) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard_setPersistentDataContainer(org.bukkit.craftbukkit.persistence.DirtyCraftPersistentDataContainer persistentDataContainer) {
        throw new ContextStateException("Not implemented");
    }
}
