// interface Algorithm {
//     void match(String riderLocation);
// }

// class AirportStrategy implements Algorithm {
//     public void match(String riderLocation) {
//         System.out.println("Matching rider at " + riderLocation + " with Airport strategy.");
//     }
// }

// class CityStrategy implements Algorithm {
//     public void match(String riderLocation) {
//         System.out.println("Matching rider at " + riderLocation + " with City strategy.");
//     }
// }

// class HighwayStrategy implements Algorithm {
//     public void match(String riderLocation) {
//         System.out.println("Matching rider at " + riderLocation + " with Highway strategy.");
//     }
// }

// class DefaultStrategy implements Algorithm {
//     public void match(String riderLocation) {
//         System.out.println("Matching rider at " + riderLocation + " with Default strategy.");
//     }
// }

// class chooseRiderStrategy {
//     private Algorithm algo;

//     chooseRiderStrategy(Algorithm _algo) {
//         this.algo = _algo;
//     }

//     public void setAlgo(Algorithm _algo) {
//         this.algo = _algo;
//     }

//     public void matchRider(String riderLocation) {
//         algo.match(riderLocation);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         chooseRiderStrategy strategy = new chooseRiderStrategy(new AirportStrategy());
//         strategy.matchRider("airport");
//         //now in case i have to change my strategy to city, highway or default suring runtime i can use if else logic
//         strategy.setAlgo(new CityStrategy());
//         strategy.matchRider("city");
//     }
// }

// /*
// when we have multiple strategies and we want to change them at runtime, we can use the Strategy Design Pattern.
// This pattern allows us to define a family of algorithms, encapsulate each one, and make them interchangeable. The Strategy Pattern lets the algorithm vary independently from clients that use it.
// in this example, we have defined different strategies for matching riders based on their location (Airport, City, Highway, Default). The `chooseRiderStrategy` class uses an `Algorithm` interface to allow for dynamic strategy changes at runtime.
//  */