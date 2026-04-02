package com.mohistmc.silkard.mixin.vanilla.world.level.block.entity;

import com.mohistmc.silkard.injected.world.level.block.entity.ContextBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.craftbukkit.persistence.CraftPersistentDataContainer;
import org.bukkit.craftbukkit.persistence.CraftPersistentDataTypeRegistry;
import org.bukkit.inventory.InventoryHolder;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Mgazul
 * @date 2026/4/2 17:16
 */
@Mixin(BlockEntity.class)
public class MixinBlockEntity implements ContextBlockEntity {

    // @formatter:off
    @Shadow protected @Nullable Level level;
    @Shadow @Final protected BlockPos worldPosition;
    // @formatter:on

    // CraftBukkit start - data containers
    private static final CraftPersistentDataTypeRegistry DATA_TYPE_REGISTRY = new CraftPersistentDataTypeRegistry();
    public CraftPersistentDataContainer persistentDataContainer;
    // CraftBukkit end

    // CraftBukkit start - read container
    @Inject(method = "loadAdditional", at = @At("RETURN"))
    public void silkard_bukkitRead(ValueInput input, CallbackInfo ci) {
        this.persistentDataContainer = new CraftPersistentDataContainer(DATA_TYPE_REGISTRY);

        input.child("PublicBukkitValues").ifPresent((persistentDataTag) -> {
            this.persistentDataContainer.putAll(persistentDataTag);
        });
    }
    // CraftBukkit end

    @Override
    public CraftPersistentDataContainer silkard_persistentDataContainer() {
        return persistentDataContainer;
    }

    @Inject(method = "saveWithoutMetadata(Lnet/minecraft/world/level/storage/ValueOutput;)V", at = @At("RETURN"))
    private void silkard_bukkitStore(ValueOutput output, CallbackInfo ci) {
        // CraftBukkit start - store container
        if (this.persistentDataContainer != null && !this.persistentDataContainer.isEmpty()) {
            this.persistentDataContainer.store(output.child("PublicBukkitValues"));
        }
        // CraftBukkit end
    }

    @Override
    public InventoryHolder silkard_getOwner() {
        if (this.level == null) return null;
        org.bukkit.block.Block block = CraftBlock.at(this.level, this.worldPosition);
        org.bukkit.block.BlockState state = block.getState();
        if (state instanceof InventoryHolder) return (InventoryHolder) state;
        return null;
    }
}
