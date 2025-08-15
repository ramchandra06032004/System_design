package services;

import java.util.Optional;
import java.util.UUID;

import Repository.TicketRepository;
import domain.Recipt;
import domain.Ticket;
import domain.Payment.PaymentStatus;

public class ReceiptService {
    public ReceiptService(){
        System.out.println("[Service] Recipt Service is Initialized");
    }
    public Recipt GenerateRecipt(Ticket ticket,double ammount){
        System.out.println("[Service] Generating Ticket");
        Recipt recipt=new Recipt(ticket.getId(), ammount); 
        System.out.println("[Service] Ticket Generated Successfully");
        return recipt;
    }
    public void markReciptAsPaid(Recipt recipt){
        System.out.println("[Service] Recipt marking as paid");
        recipt.markAsPaid();
        System.out.println("[Service] repipt marked Successfully");
    }
    public String generateReceiptText(Recipt receipt, Ticket ticket) {
        System.out.println("[SERVICE] Generating receipt text for: " + receipt.getId());
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("📄 Receipt:\n");
        receiptText.append("=== PARKING RECEIPT ===\n");
        receiptText.append("Receipt ID: ").append(receipt.getId()).append("\n");
        receiptText.append("Ticket ID: ").append(ticket.getId()).append("\n");
        receiptText.append("Vehicle: DUMMY-").append(ticket.getId()).append(" (CAR)\n");
        receiptText.append("Entry Time: ").append(ticket.getEntryTime()).append("\n");
        receiptText.append("Exit Time: ").append(receipt.getExitTime()).append("\n");
        receiptText.append("Total Fee: $").append(String.format("%.2f", receipt.getTotalFee())).append("\n");
        receiptText.append("Payment Status: ").append(receipt.getPaymentStatus()).append("\n");
        receiptText.append("=====================\n");
        
        System.out.println("[SERVICE] Receipt text generated successfully");
        return receiptText.toString();
    }
    
}
