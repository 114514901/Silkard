package com.mohistmc.silkard.mixin.vanilla.world.level.levelgen.structure;

import com.mohistmc.silkard.injected.world.level.levelgen.structure.ContextStructureStart;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import org.bukkit.craftbukkit.persistence.DirtyCraftPersistentDataContainer;
import org.bukkit.event.world.AsyncStructureGenerateEvent;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/4/2 17:31
 */
@Mixin(StructureStart.class)
public class MixinStructureStart implements ContextStructureStart {

    // CraftBukkit start
    private static final org.bukkit.craftbukkit.persistence.CraftPersistentDataTypeRegistry DATA_TYPE_REGISTRY = new org.bukkit.craftbukkit.persistence.CraftPersistentDataTypeRegistry();
    public org.bukkit.craftbukkit.persistence.DirtyCraftPersistentDataContainer persistentDataContainer = new org.bukkit.craftbukkit.persistence.DirtyCraftPersistentDataContainer(DATA_TYPE_REGISTRY);
    public org.bukkit.event.world.AsyncStructureGenerateEvent.Cause generationEventCause = org.bukkit.event.world.AsyncStructureGenerateEvent.Cause.WORLD_GENERATION;
    // CraftBukkit end

    @Override
    public AsyncStructureGenerateEvent.Cause silkard_generationEventCause() {
        return generationEventCause;
    }

    @Override
    public DirtyCraftPersistentDataContainer silkard_persistentDataContainer() {
        return persistentDataContainer;
    }

    @Override
    public void silkard_setGenerationEventCause(AsyncStructureGenerateEvent.Cause generationEventCause) {
        this.generationEventCause = generationEventCause;
    }

    @Override
    public void silkard_setPersistentDataContainer(DirtyCraftPersistentDataContainer persistentDataContainer) {
        this.persistentDataContainer = persistentDataContainer;
    }
}
