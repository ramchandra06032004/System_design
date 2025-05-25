
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
//         CheckoutService o=new CheckoutService(new  RazorPay());
//         o.makePayment(200);
//     }
// }

// /*
//  in above code we have standertized the payment process by using an interface PaymentGeteway.
//  but if we want to add a new payment gateway like CashFreePayments, we need to modify the CheckoutService class.
//     So, we can use the Adapter Design Pattern to avoid modifying the CheckoutService class.

// We can create an adapter class that implements the PaymentGeteway interface and uses the CashFreePayments class internally.

//  */