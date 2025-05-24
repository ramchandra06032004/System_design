//solution of builder pattern problem

// import java.util.List;

// class Burger {
//     private String bun;
//     private String patty;
//     private boolean isCheese;
//     private List<String> toppings;
//     private boolean coke;
//     private String sauce;
//     private boolean frenchFries;

//     Burger(BurgerBuilder burger) {
//         this.bun = burger.bun;
//         this.patty = burger.patty;
//         this.isCheese = burger.isCheese;
//         this.toppings = burger.toppings;
//         this.coke = burger.coke;
//         this.sauce = burger.sauce;
//         this.frenchFries = burger.frenchFries;
//     }

//     public static class BurgerBuilder {
//         private String bun;
//         private String patty;
//         private boolean isCheese;
//         private List<String> toppings;
//         private boolean coke;
//         private String sauce;
//         private boolean frenchFries;

//         BurgerBuilder(String _bun,String _patty ) {
//             this.bun=_bun;
//             this.patty=_patty;
//         }

//         public BurgerBuilder addCheese(boolean _isCheese){
//             this.isCheese=_isCheese;
//             return this;
//         }
//         public BurgerBuilder addTopping(List<String> _toppings){
//             this.toppings=_toppings;
//             return this;
//         }
//         public BurgerBuilder addCoke(boolean _coke){
//             this.coke=_coke;
//             return this;
//         }
//         public BurgerBuilder addSauce(String _souce){
//             this.sauce=_souce;
//             return this;
//         }
//         public BurgerBuilder addFrenchFries(boolean _frenchFries){
//             this.frenchFries=_frenchFries;
//             return this;
//         }
//         public Burger build(){
//             return new Burger(this); 
//         }


//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         Burger o=new Burger.BurgerBuilder("Wheat", "nonveg").addCheese(true).addCoke(true).addFrenchFries(true).build();
//     }
// }

// /*
//  in above code we sagregated the burger class into two classes
//     one is the burger class which is the main class and the other is the burger builder class which is used to build the burger object now we are not forcing the user to pass all the parameters at once
//     the mandatory parameters are passed in the constructor of the burger builder class and the optional parameters are passed using the methods of the burger builder class
//     this is the builder pattern
//  */