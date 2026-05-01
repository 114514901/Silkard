package com.mohistmc.silkard.mixin.vanilla.world.level.block.entity;

import com.mohistmc.silkard.injected.world.level.block.entity.ContextBeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/5/1 17:01
 */
@Mixin(BeehiveBlockEntity.class)
public class MixinBeehiveBlockEntity implements ContextBeehiveBlockEntity {

    public int maxBees = 3; // CraftBukkit - allow setting max amount of bees a hive can hold

    public int silkard$maxBees() {
        return maxBees;
    }

    public void silkard$maxBees(int maxBees) {
        this.maxBees = maxBees;
    }
}
