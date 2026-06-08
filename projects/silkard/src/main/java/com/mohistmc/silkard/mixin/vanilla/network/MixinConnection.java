package com.mohistmc.silkard.mixin.vanilla.network;

import com.mohistmc.silkard.injected.network.ContextConnection;
import java.net.SocketAddress;
import net.minecraft.network.Connection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(Connection.class)
public abstract class MixinConnection implements ContextConnection {

    @Shadow
    public String hostname;

    @Shadow
    public abstract SocketAddress getRemoteAddress();

    @Override
    public String silkard$hostname() {
        return hostname;
    }

    @Override
    public void silkard$setHostName(String hostName) {
        this.hostname = hostName;
    }

    @Override
    public SocketAddress getRawAddress() {
        return getRemoteAddress();
    }
}
