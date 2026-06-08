package com.mohistmc.silkard.mixin.vanilla.world.level.gamerules;

import com.mohistmc.silkard.injected.world.level.gamerules.ContextGameRules;
import net.minecraft.world.level.gamerules.GameRules;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(GameRules.class)
public class MixinGameRules implements ContextGameRules {
}
