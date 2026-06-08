package com.mohistmc.silkard.mixin.vanilla.server.bossevents;

import com.mohistmc.silkard.injected.server.bossevents.ContextCustomBossEvent;
import net.minecraft.server.bossevents.CustomBossEvent;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(CustomBossEvent.class)
public class MixinCustomBossEvent implements ContextCustomBossEvent {
}
