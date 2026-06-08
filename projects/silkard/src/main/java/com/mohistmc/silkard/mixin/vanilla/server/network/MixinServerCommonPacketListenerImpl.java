package com.mohistmc.silkard.mixin.vanilla.server.network;

import com.mohistmc.silkard.injected.server.network.ContextServerCommonPacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerCommonPacketListenerImpl;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ServerCommonPacketListenerImpl.class)
public abstract class MixinServerCommonPacketListenerImpl implements ContextServerCommonPacketListenerImpl {

    // CraftBukkit start
    @Unique
    public boolean processedDisconnect;

    @Unique
    public ServerPlayer player;
    // CraftBukkit end

    @Override
    public boolean silkard$processedDisconnect() {
        return processedDisconnect;
    }

    @Override
    public void silkard$setProcessedDisconnect(boolean processedDisconnect) {
        this.processedDisconnect = processedDisconnect;
    }

    @Override
    public ServerPlayer silkard$player() {
        return player;
    }

    @Override
    public void silkard$setPlayer(ServerPlayer player) {
        this.player = player;
    }

    @Override
    public CraftPlayer getCraftPlayer() {
        return (player != null) ? (CraftPlayer) player.getBukkitEntity() : null;
    }
}
