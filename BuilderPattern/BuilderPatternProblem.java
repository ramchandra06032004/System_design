// //Builder pattern

// import java.util.List;

// class Burger{
//     private String bun;
//     private String patty;
//     private boolean isCheese;
//     private List<String> toppings;
//     private boolean coke;


//     Burger(String _bun,String _patty,boolean isCheese,List<String> toppings,boolean coke){
//         this.bun=_bun;
//         this.patty=_patty;
//         this.isCheese=isCheese;
//         this.toppings=toppings;
//         this.coke=coke;

//         System.out.println("Burger is created");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Burger o=new Burger("Wheat", "veg", true, List.of("Lettuce", "Tomato"), true  );
//     }
// }

// /*
//  in above code only bun and patty are mandatory and all other are optional
//  but we are forcing to pass all the parameters to the constructor
//  the rule is take only mandatory parameters in constructor and all other optional parameters in builder class
//     and then pass the builder class object to the constructor
//  */