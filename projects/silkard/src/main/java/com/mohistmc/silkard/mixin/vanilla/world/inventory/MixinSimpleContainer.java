package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import com.mohistmc.silkard.injected.world.inventory.ContextLocationContainer;
import net.minecraft.world.SimpleContainer;
import org.bukkit.Location;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(SimpleContainer.class)
public class MixinSimpleContainer implements ContextLocationContainer {

    @Unique
    private Location silkard$location;

    @Override
    public Location getLocation() {
        return silkard$location;
    }

    @Override
    public void silkard$setLocation(Location location) {
        this.silkard$location = location;
    }
}
