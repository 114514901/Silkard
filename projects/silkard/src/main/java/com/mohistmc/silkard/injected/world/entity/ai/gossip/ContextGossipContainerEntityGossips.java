package com.mohistmc.silkard.injected.world.entity.ai.gossip;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.function.Predicate;
import net.minecraft.world.entity.ai.gossip.GossipType;

/**
 * @author Mgazul
 * @date 2026/5/13 21:54
 */
public interface ContextGossipContainerEntityGossips {

    default int unweightedValue(Predicate<GossipType> predicate) {
        throw new ContextStateException("Not implemented");
    }
}
