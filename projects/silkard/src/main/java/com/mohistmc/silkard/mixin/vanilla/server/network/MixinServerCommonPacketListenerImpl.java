package com.mohistmc.silkard.mixin.vanilla.server.network;

import com.mohistmc.silkard.injected.server.network.ContextServerCommonPacketListenerImpl;
import net.minecraft.server.network.ServerCommonPacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ServerCommonPacketListenerImpl.class)
public class MixinServerCommonPacketListenerImpl implements ContextServerCommonPacketListenerImpl {
}
