package com.mohistmc.silkard.mixin.vanilla.world.entity.monster.piglin;

import com.mohistmc.silkard.injected.world.entity.monster.piglin.ContextPiglin;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/5/1 18:14
 */
@Mixin(Piglin.class)
public class MixinPiglin implements ContextPiglin {

    // CraftBukkit start - Custom bartering and interest list
    public Set<Item> allowedBarterItems = new HashSet<>();
    public Set<Item> interestItems = new HashSet<>();
    // CraftBukkit end

    public Set<Item> silkard$allowedBarterItems() {
        return allowedBarterItems;
    }

    public Set<Item> silkard$interestItems() {
        return interestItems;
    }

}
