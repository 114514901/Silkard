package com.mohistmc.silkard.mixin.vanilla.world.entity.npc.villager;

import com.mohistmc.silkard.injected.world.entity.npc.villager.ContextVillager;
import net.minecraft.world.entity.npc.villager.Villager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Villager.class)
public class MixinVillager implements ContextVillager {

    @Shadow
    public long gossipDecayInterval;

    @Override
    public long silkard$gossipDecayInterval() {
        return gossipDecayInterval;
    }

    @Override
    public void silkard$gossipDecayInterval(long gossipDecayInterval) {
        this.gossipDecayInterval = gossipDecayInterval;
    }
}
