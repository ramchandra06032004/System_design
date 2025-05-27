// interface Pizza{
//     String getDiscription();
//     int getPrice();
// } 

// class PlainPizza  implements Pizza{
//     private int price=100;

//     public String getDiscription(){
//         return "Plain Pizza ";
//     }
//     public int getPrice(){
//         return this.price;
//     }
// }


// class Cheese implements Pizza{
//     Pizza pizza;
//     Cheese(Pizza _pizza){
//         this.pizza=_pizza;
//     }
//     public String getDiscription(){
//         return pizza.getDiscription()+"cheese ";
//     }
//     public int getPrice(){
//         return pizza.getPrice()+80;
//     }
// }

// class Olive implements Pizza{
//     Pizza pizza;
//     Olive(Pizza _pizza){
//         this.pizza=_pizza;
//     }
//     public String getDiscription(){
//         return pizza.getDiscription()+"olive ";
//     }
//     public int getPrice(){
//         return pizza.getPrice()+40;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
        
//         Pizza cheese=new Olive(new Cheese(new PlainPizza()));

//         System.out.println(cheese.getPrice());
//     }
// }

// /*
//  in above code we are using decorator pattern to add toppings to pizza
//     without creating new classes for every combination of toppings.
//     but problem is that we have not created a abstract class decorator
//     and we have to create a new class for every topping.
//     this causes the Voilation of Open/Closed Principle (OCP) and dry (Don't Repeat Yourself) principle.
//     consider we have to perform some common task before adding the topping
//     we need to write the same code in every topping class.
// // Solution is to use abstract class decorator which will contain the common code and we will extend it in every topping class.
// // This will allow us to add new toppings without altering the existing code and will also allow us to perform common tasks before adding the topping.
//  */