package com.mohistmc.silkard.injected.server.level;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;

public interface ContextServerPlayerGameMode {

    default boolean silkard$isFiredInteract() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setFiredInteract(boolean firedInteract) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$getInteractResult() {
        throw new ContextStateException("Not implemented");
    }

    default BlockPos silkard$getinteractPosition() {
        throw new ContextStateException("Not implemented");
    }

    default InteractionHand silkard$getinteractHand() {
        throw new ContextStateException("Not implemented");
    }

    default ItemStack silkard$getinteractItemStack() {
        throw new ContextStateException("Not implemented");
    }

    default boolean destroyBlock(BlockPos pos, int ack) {
        return false;
    }
}
