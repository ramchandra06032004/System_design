package domain;

import java.time.LocalDateTime;
import java.util.UUID;

import domain.Payment.PaymentGetway;
import domain.Payment.PaymentStatus;

public class Recipt {
    private UUID id;
    private UUID ticketId;
    private LocalDateTime exitTime;
    private double totalFair;
    private Payment.PaymentStatus paymentStatus;

    public Recipt(UUID _ticketId,double _totalFair){
        this.id=UUID.randomUUID();
        this.ticketId=_ticketId;
        this.exitTime=LocalDateTime.now();
        this.totalFair=_totalFair;
        this.paymentStatus=PaymentStatus.PENDING;
    }
    public void markAsPaid(){
        this.paymentStatus=PaymentStatus.SUCCESS;
    }
    public UUID getId(){
        return this.id;
    }
    public LocalDateTime getExitTime(){
        return this.exitTime;
    }
    public double getTotalFee(){
        return this.totalFair;
    }
    public Payment.PaymentStatus getPaymentStatus(){
        return this.paymentStatus;
    }
}
