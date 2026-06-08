package com.mohistmc.silkard.mixin.vanilla.server.players;

import com.mohistmc.silkard.injected.server.players.ContextStoredUserList;
import net.minecraft.server.players.StoredUserList;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(StoredUserList.class)
public class MixinStoredUserList implements ContextStoredUserList {
}
