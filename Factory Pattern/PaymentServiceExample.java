// interface PaymentService {
//     public void pay(int ammount);
// }

// class CardPayment implements PaymentService {
//     public void pay(int ammount) {
//         System.out.println("Pay " + ammount + " by card");
//     }
// }

// class UPIPayment implements PaymentService {
//     public void pay(int ammount) {
//         System.out.println("Pay " + ammount + " by UPI");
//     }
// }

// class WalletPayment implements PaymentService {
//     public void pay(int ammount) {
//         System.out.println("Pay " + ammount + " by Wallet");
//     }
// }

// class PaymentGetway {
//     public static PaymentService getPaymentMethod(String mode) {
//         if (mode == "UPI") {
//             return new UPIPayment();
//         } else if (mode == "card") {
//             return new CardPayment();
//         } else {
//             return new WalletPayment();
//         }
//     }
// }

// class HandlePayment {
//     public static void callMethod(String mode, int ammount) {
//         PaymentGetway.getPaymentMethod(mode).pay(ammount);
//     }
// }

// public class PaymentServiceExample {
//     public static void main(String[] args) {
//         HandlePayment o = new HandlePayment();
//         o.callMethod("wallet", 200);
//     }
// }
