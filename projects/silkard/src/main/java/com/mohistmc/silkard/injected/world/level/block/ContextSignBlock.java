package com.mohistmc.silkard.injected.world.level.block;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.bukkit.event.player.PlayerSignOpenEvent;

public interface ContextSignBlock {

    default void pushOpenSignCause(PlayerSignOpenEvent.Cause cause) {
        throw new ContextStateException("Not implemented");
    }

    default void openTextEdit(Player player, SignBlockEntity signEntity, boolean isFrontText, PlayerSignOpenEvent.Cause cause) {
        throw new ContextStateException("Not implemented");
    }
}
