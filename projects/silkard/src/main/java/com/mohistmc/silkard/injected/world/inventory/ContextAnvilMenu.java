package com.mohistmc.silkard.injected.world.inventory;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextAnvilMenu {

    default int silkard$getDeniedCost() {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$maximumRepairCost() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$maximumRepairCost(int maximumRepairCost) {
        throw new ContextStateException("Not implemented");
    }
}
