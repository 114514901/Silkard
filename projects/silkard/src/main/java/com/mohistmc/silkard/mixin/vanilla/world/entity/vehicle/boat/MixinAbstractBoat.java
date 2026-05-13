package com.mohistmc.silkard.mixin.vanilla.world.entity.vehicle.boat;

import com.mohistmc.silkard.injected.world.entity.vehicle.boat.ContextAbstractBoat;
import net.minecraft.world.entity.vehicle.boat.AbstractBoat;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/4/2 19:35
 */
@Mixin(AbstractBoat.class)
public class MixinAbstractBoat implements ContextAbstractBoat {

    // CraftBukkit start
    // PAIL: Some of these haven't worked since a few updates, and since 1.9 they are less and less applicable.
    public double maxSpeed = 0.4D;
    public double occupiedDeceleration = 0.2D;
    public double unoccupiedDeceleration = -1;
    public boolean landBoats = false;
    // CraftBukkit end

    @Override
    public double silkard_maxSpeed() {
        return maxSpeed;
    }

    @Override
    public void silkard_maxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double silkard_occupiedDeceleration() {
        return occupiedDeceleration;
    }

    @Override
    public void silkard_occupiedDeceleration(double occupiedDeceleration) {
        this.occupiedDeceleration = occupiedDeceleration;
    }

    @Override
    public double silkard_unoccupiedDeceleration() {
        return unoccupiedDeceleration;
    }

    @Override
    public void silkard_unoccupiedDeceleration(double occupiedDeceleration) {
        this.unoccupiedDeceleration = occupiedDeceleration;
    }

    @Override
    public boolean silkard_landBoats() {
        return landBoats;
    }

    @Override
    public void silkard_landBoats(boolean landBoats) {
        this.landBoats = landBoats;
    }
}
