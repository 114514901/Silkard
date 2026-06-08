package com.mohistmc.silkard.mixin.vanilla.world.inventory;

import com.mohistmc.silkard.injected.world.inventory.ContextContainerLevelAccess;
import net.minecraft.world.inventory.ContainerLevelAccess;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ContainerLevelAccess.class)
public class MixinContainerLevelAccess implements ContextContainerLevelAccess {
}
