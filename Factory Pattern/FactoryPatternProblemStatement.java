// interface ModeOfTransport{
//     public void send();
// }
// class ByAir implements ModeOfTransport{
//     public void send(){
//         System.out.println("Sending by air");
//     }
// }
// class ByRoad implements ModeOfTransport{
//     public void send(){
//         System.out.println("Sending by Road");
//     }
// }
// class ByRailways implements ModeOfTransport{
//     public void send(){
//         System.out.println("Sending by Railways");
//     }
// }

// class LogisticService{
//     public void sendVia(String mode){
//         if (mode=="Air") {
//             ModeOfTransport o1=new ByAir();
//             o1.send();
//         }else if (mode=="Railways") {
//             ModeOfTransport o1=new ByRailways();
//             o1.send();
//         }else if(mode=="Road"){
//             ModeOfTransport o1=new ByRoad();
//             o1.send();
//         }
//     }
// }
// public class FactoryPatternProblemStatement {
//     public static void main(String[] args) {
//         LogisticService o=new LogisticService();
//         o.sendVia("Railways");
//     }    
// }
// /*
//  problem in above pattern is that class logistic service is doing the job of creating the object of mode of transport
//     and also sending the object. This is a violation of single responsibility principle.
//     We can use factory pattern to solve this problem.
//     In factory pattern we create a factory class which will create the object of mode of transport and return it to the client.
//     The client will then use the object to send the message.
//     In this way we can separate the responsibility of creating the object and using the object.
//  */