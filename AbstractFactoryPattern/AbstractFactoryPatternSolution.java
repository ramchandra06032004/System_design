public class AbstractFactoryPatternSolution {
    
}

// interface PaymentGateway{
//     void processPayment(long ammount);
// }
// interface Invoice{
//     void generateInvoice(long ammount);
// }
// interface RegionFactory{
//     PaymentGateway createPaymentGeteway(String geteway);
//     Invoice createInvoice();
// }




// class Razorpay implements PaymentGateway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through razorpay");
//     }
// }
// class Paypal implements PaymentGateway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through Paypal");
//     }
// }
// class Strip implements PaymentGateway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through Strip");
//     }
// }
// class Paytm implements PaymentGateway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through paytm");
//     }
// }
// class Cashfree implements PaymentGateway{
//     public void processPayment(long ammount){
//         System.out.println("Pay "+ammount+" through Cashfree payments");
//     }
// }

// class GSTInvoice implements Invoice{
//     public void generateInvoice(long ammount){
//         System.out.println("Generate GST invoice of "+ammount);
//     }
// }

// class USAInvoice implements Invoice{
//     public void generateInvoice(long ammount){
//         System.out.println("Generate GST invoice of "+ammount);
//     }
// }


// class USAFactory implements RegionFactory{
//     public PaymentGateway createPaymentGeteway(String gateway){
       
//         if (gateway=="paypal") {
//             return new Paypal();
//         }else{
//             return new Strip();
//         }
//     }
//     public Invoice createInvoice(){
//         return new USAInvoice();
//     }
// }


// class IndiaFactory implements RegionFactory{
//     public PaymentGateway createPaymentGeteway(String gateway){
//         if (gateway=="razorpay") {
//             return new Razorpay();
//         }else if (gateway=="paytm") {
//             return new Paytm();
//         }else {
//             return new Cashfree();
//         }
//     }
//     public Invoice createInvoice(){
//         return new GSTInvoice();
//     } 
// }

// class CheckoutService{
//     private PaymentGateway paymentGateway;
//     private Invoice invoice;
//     CheckoutService(RegionFactory factory,String gateway){
//         this.paymentGateway=factory.createPaymentGeteway(gateway);
//         this.invoice=factory.createInvoice();
//     }

//     public void completePayment(long ammount){
//         paymentGateway.processPayment(ammount);
//         invoice.generateInvoice(ammount);
//     }
// }


// public class Main {
    
//     public static void main(String[] args) {
//         CheckoutService o=new CheckoutService(new USAFactory(), "paypal");
//         o.completePayment(600);
//     }
// }


// /*
//  here we are dealing with multipal factories so when we use simple factory pattern we need to change code in checkout service
//  that means we need to change the code in checkout service if we want to add new factory which is nor scalable
//     so we are using abstract factory pattern
//     in this pattern we are creating a factory for each region and then we are using that factory to create the payment gateway and invoice
//     so we are not changing the code in checkout service
//     so we are using abstract factory pattern
//  */