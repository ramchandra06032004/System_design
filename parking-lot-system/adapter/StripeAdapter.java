package adapter;

import java.util.Random;
import java.util.UUID;

public class StripeAdapter implements PaymentGatewayAdapter{
    public boolean pay(UUID ticketId,double ammount){
        System.out.println("[ADAPTER] the Strip is processing ticket for ticket id "+ticketId+" with ammount "+ammount);
        Random random=new Random();
        boolean status=random.nextDouble()<=0.9;
        System.out.println("[ADAPTER] Strip payment result: " + (status ? "SUCCESS" : 
        "FAILED"));
        return status;
    }
}
