package adapter;

import java.util.Random;
import java.util.UUID;

public class RazorpayAdapter implements PaymentGatewayAdapter{
    public boolean pay(UUID ticketId,double ammount){
        System.out.println("[ADAPTER] the razorPayAdapter is processing ticket for ticket id "+ticketId+" with ammount "+ammount);
        Random random=new Random();
        boolean status=random.nextDouble()<=0.9;
        System.out.println("[ADAPTER] RazorpayAdapter payment result: " + (status ? "SUCCESS" : 
        "FAILED"));
        return status;
    }
}