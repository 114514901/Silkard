package com.mohistmc.silkard.injected.world.entity.projectile.throwableitemprojectile;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.item.Item;

public interface ContextThrowableItemProjectile {

    default Item getDefaultItemPublic() {
        throw new ContextStateException("Not implemented");
    }
}
