package com.mohistmc.silkard.injected.world.level.storage.loot;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.Container;
import net.minecraft.world.level.storage.loot.LootParams;
import org.bukkit.craftbukkit.CraftLootTable;

public interface ContextLootTable {

    default void fillInventory(Container iinventory, LootParams lootparams, long i, boolean plugin) {
        throw new ContextStateException("Not implemented");
    }

    default CraftLootTable silkard$craftLootTable() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setCraftLootTable(CraftLootTable craftLootTable) {
        throw new ContextStateException("Not implemented");
    }
}
