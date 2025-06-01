// interface Appliances{
//     void on();
//     void of();
// }

// class TV implements Appliances{
//     public void on(){
//         System.out.println("TV on");
//     }
//     public void of(){
//         System.out.println("TV of");
//     }
// }
// class AC implements Appliances{
//     public void on(){
//         System.out.println("AC on");
//     }
//     public void of(){
//         System.out.println("AC of");
//     }
// }
// class Light implements Appliances{
//     public void on(){
//         System.out.println("Light on");
//     }
//     public void of(){
//         System.out.println("Light of");
//     }
// }


// class Remote{
//     private Appliances ac;
//     private Appliances tv;
//     private Appliances light;

//     String lastAction="";
//     Remote(Appliances _ac,Appliances _light,Appliances _tv){
//         ac=_ac;
//         tv=_tv;
//         light=_light;
//     }

//     public void turnOnTV(){
//         lastAction = "TV on";
//         tv.on();
//     }
//     public void turnOfTv(){
//         lastAction = "TV of";
//         tv.of();
//     }
//     public void turnOnAC(){
//         lastAction = "AC on";
//         ac.on();
//     }
//     public void turnOfAC(){
//         lastAction = "AC of";
//         ac.of();
//     }
//     public void turnOnLight(){
//         lastAction = "Light on";
//         light.on();
//     }
//     public void turnOfLight(){
//         lastAction = "Light of";
//         light.of();
//     }

//     public void undo(){
//         if (lastAction=="") {
//             System.out.println("no action to undo");
//         }
//         else if (lastAction.equals("TV on")) {
//             lastAction = "TV of";
//             turnOfTv();
//         } else if (lastAction.equals("TV of")) {
//             lastAction = "TV on";
//             turnOnTV();
//         } else if (lastAction.equals("AC on")) {
//             lastAction = "AC of";
//             turnOfAC();
//         } else if (lastAction.equals("AC of")) {
//             lastAction = "AC on";
//             turnOnAC();
//         } else if (lastAction.equals("Light on")) {
//             lastAction = "Light of";
//             turnOfLight();
//         } else if (lastAction.equals("Light of")) {
//             lastAction = "Light on";
//             turnOnLight();
//         }
//     }

// }
// public class Main {

//     public static void main(String[] args) {
//         TV tv = new TV();
//         AC ac = new AC();
//         Light light = new Light();
//         Remote remote = new Remote(ac, light, tv);
//         remote.turnOnTV();
//         remote.turnOnAC();
//         remote.turnOnLight();
//         remote.undo();
//         remote.undo();
//         remote.undo();
//     }
// }
// /*
//  now in above code there is tight coupling between Remote and Appliances
//  if we have to add a new appliance like fridge we have to change the Remote class
//     to add the fridge functionality
//     in industry we use command design patterns to solve this problem
//     command design pattern is a behavioral design pattern that turns a request into a stand-alone object
//     now client talk to remote object and remote object talk to appliances via command object
//     so we can add new appliances without changing the Remote class
//     remote should not know about the appliances
//     we can use command design pattern to solve this problem
//  */