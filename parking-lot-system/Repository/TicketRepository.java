package Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import domain.Ticket;

public class TicketRepository {
    Map<UUID,Ticket> tickets=new ConcurrentHashMap<>();

    public Ticket save(Ticket ticket){
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }
    public Optional<Ticket> findById(UUID id){
        return Optional.ofNullable(tickets.get(id));
    }
    public List<Ticket> findActiveTickets(){
        return tickets.values()
        .stream().
        filter(ticket->ticket.getIsActive()).toList();
    }
    public void deactivateTicket(UUID ticketId){
        tickets.computeIfPresent(ticketId, (id,ticket)->{
            ticket.setActive(false);
            return ticket;
        });
    }
    
}
