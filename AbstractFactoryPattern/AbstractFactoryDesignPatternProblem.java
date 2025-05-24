
// interface PaymentGetway{
//     void processPayment(long ammount);
// }
// interface Invoice{
//     void generateInvoice(long ammount);
// }

// class Razorpay implements PaymentGetway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through razorpay");
//     }
// }
// class Paytm implements PaymentGetway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through paytm");
//     }
// }
// class Cashfree implements PaymentGetway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through Cashfree payments");
//     }
// }

// class GSTInvoice implements Invoice{
//     public void generateInvoice(long ammount){
//         System.out.println("Generate GST invoice of "+ammount);
//     }
// }

// class CheckoutService{
//     String getway;
//     CheckoutService(String _getway){
//         this.getway=_getway;
//     }
//     public void handlePayment(long ammount){
//         if (getway.equals("razorpay")) {
//             PaymentGetway o=new Razorpay();
//             o.processPayment(ammount);
//         }else if(getway.equals("paytm")){
//             PaymentGetway o=new Paytm();
//             o.processPayment(ammount);
//         }else{
//             PaymentGetway o=new Cashfree();
//             o.processPayment(ammount);
//         }
//         GSTInvoice o=new GSTInvoice();
//         o.generateInvoice(ammount);
//     }
// }

// public class AbstractFactoryDesignPatternProblem {

//     public static void main(String[] args) {
//         CheckoutService o=new CheckoutService("paytm");
//         o.handlePayment(200);
//     }
// }

// /*
//  in above code problem is that we are creating object of payment getway and invoice in checkout service class
//  which breaks single responsibility principle
//  and when we have to impleament checkout service for USA then we have to change the code in checkout service class
//  and this is not good
//  so address this problem we will use abstract factory design pattern

//  */