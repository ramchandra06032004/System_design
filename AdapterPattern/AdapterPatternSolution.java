
    

// interface PaymentGeteway{
//     void pay(int ammount);
// }

// class RazorPay implements PaymentGeteway{
//     public void pay(int ammount){
//         System.out.println("Payment of " + ammount + " done using RazorPay");
//     }
// }
// class Paytm implements PaymentGeteway{
//     public void pay(int ammount){
//         System.out.println("Payment of " + ammount + " done using Paytm");
//     }
// }
// class CashFreePayments{
//     public void doPayment(int ammount){
//         System.out.println("Payment of " + ammount + " done using CashFreePayments");
//     }
// }

// class CashFreePaymentsAdapter implements PaymentGeteway{
//     CashFreePayments cashfreeObject;
//     CashFreePaymentsAdapter(){
//         this.cashfreeObject=new CashFreePayments();
//     }
//     public void pay(int ammount){
//         cashfreeObject.doPayment(ammount);
//     }
// }

// class CheckoutService{
//     private PaymentGeteway Provider;
//     CheckoutService(PaymentGeteway _Provider){
//         this.Provider=_Provider;
//     }

//     public void makePayment(int ammount){
//         Provider.pay(ammount);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         CheckoutService o=new CheckoutService(new  CashFreePaymentsAdapter());
//         o.makePayment(200);
//     }
// }

// /*
//  in above code we have standertized the payment process by using an interface PaymentGeteway.
//  the problem was we had multiple payment gateways like RazorPay, Paytm and CashFreePayments.
//     we created an adapter class CashFreePaymentsAdapter that implements the PaymentGeteway interface
//     and internally uses the CashFreePayments class to perform the payment.
// This allows us to use CashFreePayments in the same way as RazorPay and Paytm,
// thus achieving a consistent interface for payment processing.
// This is an example of the Adapter Design Pattern,
//  */