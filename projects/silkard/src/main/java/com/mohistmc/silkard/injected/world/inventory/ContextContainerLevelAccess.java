package com.mohistmc.silkard.injected.world.inventory;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.bukkit.Location;

public interface ContextContainerLevelAccess {

    default Level getWorld() {
        throw new ContextStateException("Not implemented");
    }

    default BlockPos getPosition() {
        throw new ContextStateException("Not implemented");
    }

    default Location getLocation() {
        throw new ContextStateException("Not implemented");
    }
}
