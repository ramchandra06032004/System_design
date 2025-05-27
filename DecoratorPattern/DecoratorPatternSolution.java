// interface Pizza{
//     String getDiscription();
//     int getPrice();
// } 

// class PlainPizza  implements Pizza{
//     private String discription="Plain Pizza ";
//     private int price=100;

//     public String getDiscription(){
//         return this.discription;
//     }
//     public int getPrice(){
//         return this.price;
//     }
// }
// class MargheritaPizza  implements Pizza{
//     private String discription="Margherita Pizza ";
//     private int price=150;

//     public String getDiscription(){
//         return this.discription;
//     }
//     public int getPrice(){
//         return this.price;
//     }
// }

// abstract class PizzaDecorator implements Pizza{
//     Pizza pizza;
//     PizzaDecorator(Pizza _pizza){
//         this.pizza=_pizza;
//     }
//     public void logAddingTopping(String topping){
//         System.out.println("Adding "+topping+" to pizza");
//     }
// }
// class Cheese extends PizzaDecorator{

//     Cheese(Pizza _pizza){
//         super(_pizza);
//     }
//     public String getDiscription(){
//         logAddingTopping("cheese");
//         // here we can perform some common task before adding the topping
//         return pizza.getDiscription()+"cheese ";
//     }
//     public int getPrice(){
//         return pizza.getPrice()+80;
//     }
// }

// class Olives extends PizzaDecorator{
//     Olives(Pizza _pizza){
//         super(_pizza);
//     }
//     public String getDiscription(){
//         logAddingTopping("olives");
//         // here we can perform some common task before adding the topping
//         return pizza.getDiscription()+"olives ";
//     }
//     public int getPrice(){
//         return pizza.getPrice()+50;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Pizza o=new PlainPizza();
//         Pizza cheese=new Cheese(o);
//         Pizza olives=new Olives(cheese);
//         System.out.println(olives.getPrice());
//         System.out.println(olives.getDiscription());
//     }
// }

// /*
// In this code, we have created an abstract class `PizzaDecorator` that implements the `Pizza` interface.
// This class takes a `Pizza` object as a parameter and provides a method to log the addition of toppings. The `Cheese` and `Olives` classes extend `PizzaDecorator`, allowing us to add toppings without violating the Open/Closed Principle (OCP) and adhering to the DRY principle.
// This way, we can easily add new toppings by creating new classes that extend `PizzaDecorator`, and we can also perform common tasks before adding the topping without duplicating code.
// // This approach allows us to maintain a clean and extensible codebase while adhering to design principles.
//  */