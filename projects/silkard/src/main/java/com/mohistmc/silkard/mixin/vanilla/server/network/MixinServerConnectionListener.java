package com.mohistmc.silkard.mixin.vanilla.server.network;

import com.mohistmc.silkard.injected.server.network.ContextServerConnectionListener;
import net.minecraft.server.network.ServerConnectionListener;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(ServerConnectionListener.class)
public class MixinServerConnectionListener implements ContextServerConnectionListener {
}
