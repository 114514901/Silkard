package com.mohistmc.silkard.injected.server.level;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.server.level.Ticket;
import net.minecraft.server.level.TicketType;

/**
 * @author Mgazul
 * @date 2026/3/28 20:18
 */
public interface ContextTicket {

    default void silkard_key(Object key) {
        throw new ContextStateException("Not implemented");
    }

    default Object silkard_key() {
        throw new ContextStateException("Not implemented");
    }

    static Ticket of(TicketType tickettype, int i, Object key) {
        Ticket ticket = new Ticket(tickettype, i);
        ticket.silkard_key(key);
        return ticket;
    }
}
