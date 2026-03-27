package com.mohistmc.silkard.injected.world.level.levelgen.structure.templatesystem;

import com.mohistmc.silkard.util.ContextStateException;
import org.bukkit.craftbukkit.persistence.CraftPersistentDataContainer;

public interface ContextStructureTemplate {

    default CraftPersistentDataContainer silkard$persistentDataContainer() {
        throw new ContextStateException("Not implemented");
    }
}
