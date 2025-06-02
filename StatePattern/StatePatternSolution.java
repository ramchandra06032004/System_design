
// interface OrderState{
//     void next(ContextOrder context);
//     void cancle(ContextOrder context);
//     String getState();   
// }


// class OrderPlaced implements OrderState{
//     public void next(ContextOrder order){
//         order.setOrderState(new PrepringState());
//         System.out.println("Order is now placed");
//     }
//     public void cancle(ContextOrder order){
//         order.setOrderState(new Cancelled());
//         System.out.println("Order is now canceled");
//     }
//     public String getState(){
//         return "ORDER PLACED";
//     }
// }
// class Cancelled implements OrderState{
//     public void next(ContextOrder order){
//         System.out.println("Order is canceled no next step");
//     }
//     public void cancle(ContextOrder order){
//         System.out.println("Order is already canceled");
//     }
//     public String getState(){
//         return "ORDER CANCELED";
//     }
// }
// class PrepringState implements OrderState{
//     public void next(ContextOrder order){
//         order.setOrderState(new Packed());
//         System.out.println("Order is now being prepared");
//     }
//     public void cancle(ContextOrder order){
//         order.setOrderState(new Cancelled());
//         System.out.println("Order is now canceled");
//     }
//     public String getState(){
//         return "ORDER PREPARING";
//     }
// }
// class Packed implements OrderState{
//     public void next(ContextOrder order){
//         order.setOrderState(new OutForDelivery());
//         System.out.println("Order is now packed");
//     }
//     public void cancle(ContextOrder order){
//         order.setOrderState(new Cancelled());
//         System.out.println("Order is now canceled");
//     }
//     public String getState(){
//         return "ORDER PACKED";
//     }
// }
// class OutForDelivery implements OrderState{
//     public void next(ContextOrder order){
//         order.setOrderState(new Deliverd());
//         System.out.println("Order is out for delivery");
//     }
//     public void cancle(ContextOrder order){
//         order.setOrderState(new Cancelled());
//         System.out.println("Order is now canceled");
//     }
//     public String getState(){
//         return "ORDER PACKED";
//     }
// }
// class Deliverd implements OrderState{
//     public void next(ContextOrder order){
//         System.out.println("Order is deliverd no next step");
//     }
//     public void cancle(ContextOrder order){
//         System.out.println("Order is already delivered cannot be canceled");
//     }
//     public String getState(){
//         return "ORDER DELIVERED";
//     }
// }

// class ContextOrder{
//     private OrderState order;
//     ContextOrder(){
//         order=new OrderPlaced();
//         System.out.println("Order is now being prepared");
//     }
//     public void setOrderState(OrderState state){
//         order=state;
//     }
//     public void nextState(){
//         order.next(this);
//     }
//     public void cancel(){
//         order.cancle(this);
//     }
//     public String getState(){
//         return this.order.getState();
//     }

// }


// public class Main {

//     public static void main(String[] args) {
//         ContextOrder order = new ContextOrder();
        
//         // Simulate order processing
//         order.nextState(); // ORDER PLACED -> ORDER PREPARING
//         order.nextState(); // ORDER PREPARING -> ORDER PACKED
//         order.nextState(); // ORDER PACKED -> OUT FOR DELIVERY
//         order.cancel(); // Should cancel as it's OUT FOR DELIVERY
//         order.nextState(); // OUT FOR DELIVERY -> ORDER DELIVERED
        
//         // Try to cancel after delivery
//         order.cancel(); // Should not cancel as it's already delivered
        
//         System.out.println("Current Order State: " + order.getState());
//     }
// }

// /*
// In this code, we have implemented the State Pattern to manage the order states. Each state is represented by a class that implements the `OrderState` interface. The `ContextOrder` class holds the current state and delegates the state-specific behavior to the current state object. This makes it easy to add new states without modifying existing code, adhering to the Open/Closed Principle of SOLID design principles.

// whats the diff between state and strategy design pattern?
// // The State and Strategy design patterns are both behavioral design patterns, but they serve different purposes and have distinct characteristics.
// // 1. Purpose:
// //    - State Pattern: The State pattern is used to allow an object to change its behavior when its internal state changes. It encapsulates the state-specific behavior in separate classes, making it easier to manage complex state transitions.
// //    - Strategy Pattern: The Strategy pattern is used to define a family of algorithms, encapsulate each one, and make them interchangeable. It allows the algorithm to vary independently from the clients that use it.
// // 2. Context:
// //    - State Pattern: The context in the State pattern is an object that maintains a reference to a state object and delegates state-specific behavior to it. The context can change its state dynamically.
// //    - Strategy Pattern: The context in the Strategy pattern is an object that uses a strategy object to perform a specific algorithm. The context can switch between different strategies at runtime.
// // 3. State vs. Algorithm:
// //    - State Pattern: The focus is on the state of an object and how it changes over time. Each state represents a specific condition of the object, and the behavior can change based on that state.
// //    - Strategy Pattern: The focus is on the algorithm or behavior that can be applied to an object. Each strategy represents a different way to perform a specific task or calculation.
//  */