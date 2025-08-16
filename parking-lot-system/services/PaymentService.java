package services;

import java.util.UUID;

import Repository.PaymentRepository;
import adapter.PaymentGatewayAdapter;
import adapter.RazorpayAdapter;
import adapter.StripeAdapter;
import domain.Payment;
import domain.Payment.PaymentGetway;

public class PaymentService {
    private PaymentRepository paymentRepository;
    private PaymentGatewayAdapter defaultGetway;
    
    PaymentService(PaymentRepository _PaymentRepository){
        this.paymentRepository=_PaymentRepository;
        this.defaultGetway=new RazorpayAdapter();
        System.out.println("[SERVICE] PaymentService initialized with default gateway: Razorpay");
    }
    
    public boolean processPayments(UUID id,double ammount){
        System.out.println("[SERVICE] Processing the payment");
        Payment payment=new Payment(PaymentGetway.RAZORPAY, ammount, id);
        paymentRepository.save(payment);
        boolean status=defaultGetway.pay(id, ammount);
        if (status) {
            payment.markAsSuccess();
        }else{
            payment.markAsFailed();
        }
        paymentRepository.update(payment);
        System.out.println("[SERVICE] Payment processed with status: " + (status ? "SUCCESS" : "FAILED"));
        
        return status;
    }
    public boolean paymentWithRetry(int noOfTimeRetry,UUID ticketId,double ammount){
        System.out.println("[SERVICE] Processing the payment with retries");
        Payment payment=new Payment(PaymentGetway.RAZORPAY, ammount, ticketId);
        paymentRepository.save(payment);
        for(int i=0 ; i<noOfTimeRetry ; i++){
            boolean status=defaultGetway.pay(ticketId, ammount);
            if (status) {
                payment.markAsSuccess();
                System.out.println("[SERVICE] Payment processed with status: " + (status ? "SUCCESS" : "FAILED"));
                return true;
            }

            if (i>1) {
                defaultGetway=new StripeAdapter();
                System.out.println("[SERVICE] Switching to Stripe gateway for retry");
            }
        }
        System.out.println("[SERVICE] Payment failed after " + noOfTimeRetry + " attempts");
        paymentRepository.update(payment);
        return false;
    }
    public void setDefaultGetway(PaymentGatewayAdapter _paymentGatewayAdapter){
        this.defaultGetway=_paymentGatewayAdapter;
    }
}
