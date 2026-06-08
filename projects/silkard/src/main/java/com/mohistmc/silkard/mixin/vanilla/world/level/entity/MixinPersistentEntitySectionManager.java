package com.mohistmc.silkard.mixin.vanilla.world.level.entity;

import com.mohistmc.silkard.injected.world.level.entity.ContextPersistentEntitySectionManager;
import net.minecraft.world.level.entity.PersistentEntitySectionManager;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(PersistentEntitySectionManager.class)
public class MixinPersistentEntitySectionManager implements ContextPersistentEntitySectionManager {
}
