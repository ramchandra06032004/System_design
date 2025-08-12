package domain;

import java.time.LocalDateTime;
import java.util.UUID;
import domain.Payment.PaymentStatus;

public class Recipt {
    private UUID id;
    private UUID ticketId;
    private LocalDateTime exitTime;
    private double totalFair;
    private Payment.PaymentStatus paymentStatus;

    Recipt(UUID _ticketId,double _totalFair){
        this.id=UUID.randomUUID();
        this.ticketId=_ticketId;
        this.exitTime=LocalDateTime.now();
        this.totalFair=_totalFair;
        this.paymentStatus=PaymentStatus.PENDING;
    }
}
