package com.mohistmc.silkard.mixin.vanilla.server.players;

import com.mohistmc.silkard.injected.server.players.ContextBanListEntry;
import net.minecraft.server.players.BanListEntry;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(BanListEntry.class)
public class MixinBanListEntry implements ContextBanListEntry {
}
