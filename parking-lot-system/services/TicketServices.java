package services;

import java.util.Optional;
import java.util.UUID;

import Repository.TicketRepository;
import domain.Ticket;

public class TicketServices {
    private TicketRepository ticketRepository;
    TicketServices(TicketRepository _TicketRepository){
        this.ticketRepository=_TicketRepository;
    }

    public Ticket generateTicket(UUID vehicleId,UUID slotId){
        System.out.println("[Service] Making new Ticket");
        Ticket newTicket=new Ticket(vehicleId, slotId);
        ticketRepository.save(newTicket);
        System.out.println("[Service] New ticket is successfully generated");
        return newTicket;
    }
    public Optional<Ticket> getTicket(UUID id){
        System.out.println("[Service] Finding Ticket with UUID "+id);
        return ticketRepository.findById(id);
    }
    public void deactivateTicket(UUID id){
        System.out.println("[Service] Deactivating ticket with id "+id);
        ticketRepository.deactivateTicket(id);
    }
}
