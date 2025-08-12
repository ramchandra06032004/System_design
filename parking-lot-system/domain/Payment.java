package domain;

import java.util.UUID;

public class Payment {
    public enum PaymentGetway{
        RAZORPAY,
        PAYPAL
    }
    public enum PaymentStatus{
        PENDING,
        SUCCESS,
        FAILED
    }
    private UUID id;
    private UUID ticketId;
    private double ammount;
    private PaymentGetway paymentGetway;
    private PaymentStatus paymentStatus;

    Payment(PaymentGetway _PaymentGetway,double _ammount,UUID _ticketId){
        this.id=UUID.randomUUID();
        this.ticketId=_ticketId;
        this.ammount=_ammount;
        this.paymentGetway=_PaymentGetway;
        this.paymentStatus=PaymentStatus.PENDING;
    }
    public UUID getId(){
        return this.id;
    }
    public UUID getTicketId(){
        return this.ticketId;
    }
}
