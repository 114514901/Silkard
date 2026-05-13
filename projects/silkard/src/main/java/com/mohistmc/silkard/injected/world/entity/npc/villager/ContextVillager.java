package com.mohistmc.silkard.injected.world.entity.npc.villager;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextVillager {

    default long silkard$gossipDecayInterval() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$gossipDecayInterval(long gossipDecayInterval) {
        throw new ContextStateException("Not implemented");
    }
}
