package com.mohistmc.silkard.injected.server.players;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.Collection;
import net.minecraft.server.players.StoredUserEntry;

public interface ContextStoredUserList<K, V extends StoredUserEntry<K>> {

   default Collection<V> getValues() {
       throw new ContextStateException("Not implemented");
   }
}
