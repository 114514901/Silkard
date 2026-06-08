package com.mohistmc.silkard.mixin.vanilla.server.level;

import com.mohistmc.silkard.injected.server.level.ContextServerEntity;
import net.minecraft.server.level.ServerEntity;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ServerEntity.class)
public class MixinServerEntity implements ContextServerEntity {
}
