package com.mohistmc.silkard.mixin.vanilla.world;

import com.mohistmc.silkard.injected.world.ContextContainer;
import net.minecraft.world.Container;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Container.class)
public interface MixinContainer extends ContextContainer {
}
