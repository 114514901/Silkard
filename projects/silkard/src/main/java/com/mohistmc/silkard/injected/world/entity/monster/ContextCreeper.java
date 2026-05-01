package com.mohistmc.silkard.injected.world.entity.monster;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.Entity;

public interface ContextCreeper {

    default void setPowered(boolean power) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$entityIgniter(Entity entityIgniter) {
        throw new ContextStateException("Not implemented");
    }

    default Entity silkard$entityIgniter() {
        throw new ContextStateException("Not implemented");
    }
}
