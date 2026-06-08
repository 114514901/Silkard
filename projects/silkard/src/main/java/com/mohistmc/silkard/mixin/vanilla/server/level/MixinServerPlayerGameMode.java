package com.mohistmc.silkard.mixin.vanilla.server.level;

import com.mohistmc.silkard.injected.server.level.ContextServerPlayerGameMode;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayerGameMode;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ServerPlayerGameMode.class)
public class MixinServerPlayerGameMode implements ContextServerPlayerGameMode {

    @Shadow
    public boolean firedInteract;

    @Shadow
    public boolean interactResult;

    @Shadow
    public BlockPos interactPosition;

    @Shadow
    public InteractionHand interactHand;

    @Shadow
    public ItemStack interactItemStack;

    @Override
    public boolean silkard$isFiredInteract() {
        return firedInteract;
    }

    @Override
    public void silkard$setFiredInteract(boolean firedInteract) {
        this.firedInteract = firedInteract;
    }

    @Override
    public boolean silkard$getInteractResult() {
        return interactResult;
    }

    @Override
    public BlockPos silkard$getinteractPosition() {
        return interactPosition;
    }

    @Override
    public InteractionHand silkard$getinteractHand() {
        return interactHand;
    }

    @Override
    public ItemStack silkard$getinteractItemStack() {
        return interactItemStack;
    }
}
