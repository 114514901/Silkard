package com.mohistmc.silkard.injected.world.level.portal;

import org.bukkit.event.player.PlayerTeleportEvent;

public interface ContextDimensionTransition {

    default void setTeleportCause(PlayerTeleportEvent.TeleportCause cause) {

    }

    default PlayerTeleportEvent.TeleportCause getTeleportCause() {
        return PlayerTeleportEvent.TeleportCause.COMMAND;
    }
}
