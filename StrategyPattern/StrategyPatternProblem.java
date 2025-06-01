// class ChooseStrategy{
//     public void match(String riderLocation ,String matchType){
//         if (matchType.equals("Airport")) {
//             //my algorithm of choose strategy for airport like nearby airports, etc.
//             System.out.println("Matching rider at " + riderLocation + " with Airport strategy.");
//         }else if(matchType.equals("City")) {
//             //my algorithm of choose strategy for city
//             System.out.println("Matching rider at " + riderLocation + " with City strategy.");
//         }else if(matchType.equals("Highway")) {
//             //my algorithm of choose strategy for highway
//             System.out.println("Matching rider at " + riderLocation + " with Highway strategy.");
//         }else {
//             //my algorithm of choose strategy for default
//             System.out.println("Matching rider at " + riderLocation + " with Default strategy.");
//         }
        
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         ChooseStrategy cs = new ChooseStrategy();
//         cs.match("JFK Airport", "Airport");
//         cs.match("Downtown", "City");
//         cs.match("I-95", "Highway");
//         cs.match("Unknown", "Unknown");
//     }
// }
// /*
//  in above code problem is that we have to write if else condition for every strategy and it is not scalable.
// this makes code messy and hard to maintain.
// violation of Open/Closed Principle (OCP) of SOLID principles.
// To solve this problem, we can use the Strategy Design Pattern.
//  */