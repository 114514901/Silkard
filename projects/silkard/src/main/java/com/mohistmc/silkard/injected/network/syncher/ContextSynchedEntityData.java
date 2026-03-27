package com.mohistmc.silkard.injected.network.syncher;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.network.syncher.EntityDataAccessor;

public interface ContextSynchedEntityData {

    default <T> void markDirty(EntityDataAccessor<T> entitydataaccessor) {
        throw new ContextStateException("Not implemented");
    }
}
