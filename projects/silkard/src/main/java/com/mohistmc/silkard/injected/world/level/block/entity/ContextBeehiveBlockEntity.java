package com.mohistmc.silkard.injected.world.level.block.entity;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.List;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public interface ContextBeehiveBlockEntity {

    default int silkard$maxBees() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMaxBees(int maxBees) {
        throw new ContextStateException("Not implemented");
    }

    default List<Entity> releaseBees(BlockState iblockdata, BeehiveBlockEntity.BeeReleaseStatus tileentitybeehive_releasestatus, boolean force) {
        throw new ContextStateException("Not implemented");
    }
}
