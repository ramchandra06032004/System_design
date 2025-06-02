// class Order{
//     private String orderState;
//     Order(){
//         System.out.println("Order has been created.");
//         this.orderState="ORDER PLACED";
//     }

//     public void cancelOrder(){
//         if (orderState=="ORDER PLACED" || orderState=="ORDER PREPARING") {
//             orderState = "ORDER CANCELED";
//             System.out.println("Order has been canceled.");
//         } else {
//             System.out.println("Order cannot be canceled at this stage.");
//         }
//     }

//     public void nextOrder(){
//         switch (orderState) {
//             case "ORDER PLACED":
//                 orderState = "ORDER PREPARING";
//                 System.out.println("Order is now being prepared.");
//                 break;
//             case "ORDER PREPARING":
//                 orderState = "ORDER READY";
//                 System.out.println("Order is now ready for pickup.");
//                 break;
//             case "ORDER READY":
//                 orderState ="OUT FOR DELIVERY";
//                 System.out.println("Order is out for delivery.");
//                 break;
//             case "OUT FOR DELIVERY":
//                 orderState = "ORDER DELIVERED";
//                 System.out.println("Order has been delivered.");
//                 break;
                 
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Order order = new Order();
        
//         // Simulate order processing
//         order.nextOrder(); // ORDER PLACED -> ORDER PREPARING
//         order.nextOrder(); // ORDER PREPARING -> ORDER READY
//         order.nextOrder(); // ORDER READY -> OUT FOR DELIVERY
//         order.cancelOrder(); // Should not cancel as it's OUT FOR DELIVERY
//         order.nextOrder(); // OUT FOR DELIVERY -> ORDER DELIVERED
        
//         // Try to cancel after delivery
//         order.cancelOrder(); // Should not cancel as it's already delivered
//     }
// }

// /*
//  in above code we have created a class Order which has methods to change the state of the order and cancel it.
//  but the problem here is order class is not scalable and not maintainable.
//  consider we have to add more states like ORDER RETURNED, ORDER REFUNDED etc we need to modify the Order class.
//  which violates the Open/Closed Principle of SOLID design principles.
// To solve this problem we can use the State Design Pattern.
// // The State Design Pattern allows an object to alter its behavior when its internal state changes.
// This pattern is particularly useful when an object needs to change its behavior based on its state, without resorting to large conditional statements or complex state management logic.

//  */