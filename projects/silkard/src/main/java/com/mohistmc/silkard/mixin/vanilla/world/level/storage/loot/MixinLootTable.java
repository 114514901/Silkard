package com.mohistmc.silkard.mixin.vanilla.world.level.storage.loot;

import com.mohistmc.silkard.injected.world.level.storage.loot.ContextLootTable;
import net.minecraft.world.level.storage.loot.LootTable;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(LootTable.class)
public class MixinLootTable implements ContextLootTable {
}
