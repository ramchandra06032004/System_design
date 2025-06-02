// abstract class NotificationSender{
//     public final void send(String to,String message){
//         rateLimitCheck(to);
//         validateMobileNumber(to);
//         String formatted=formateMessage(message);
//         logBeforeSend(formatted,message);
//         String compossedMessage=composeMesage(message);
//         sendMesage(to, compossedMessage);
//         analyticsMessage(to);
//     }
//     private void rateLimitCheck(String to){
//         System.out.println("Rate limit check for user "+to);
//     }
//     private void validateMobileNumber(String to){
//         System.out.println("Validating Given address");
//     }
//     private String formateMessage(String message){
//         String formatted = message.trim();
//         return formatted;
//     }
//     private void logBeforeSend(String formatted,String message){
//         System.out.println("Logging before send message    " + message + " is formatted to " + formatted);
//     }
//     protected abstract String composeMesage(String message);
//     protected abstract void sendMesage(String to,String message);

//     private void analyticsMessage(String to){
//         System.out.println("Custom Analytics for "+to);
//     }
// }

// class EmailNotificationSender extends NotificationSender{
//     public String composeMesage(String message){
//         return "[EMAIL] "+message;
//     }
//     public void sendMesage(String to,String message){
//         System.out.println("sending Notification to " + to + " with Email :- "+message);
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         EmailNotificationSender o=new EmailNotificationSender();
//         o.send("rajumulik51@gmail.com", "welcome to leetcode");
//     }
// }

// /*
//  now in above code if we have to to implement new notification sender like whatsapp notification
//     we just have to extend the NotificationSender class and implement the abstract methods composeMesage and sendMesage
//     so we enforce the developer to follow the steps defined in the NotificationSender class
// //  and we can reuse the code for rate limit check, validating phone number, logging before send message and custom analytics
// //  This way we can avoid code duplication and enforce a certain structure in the subclasses
// //  Template Method Design Pattern is a powerful pattern that can help you to enforce a certain structure in your code and avoid code duplication
// //  Template Method Design Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
// //  This pattern is useful when you have a common algorithm that needs to be implemented in different ways, allowing for code reuse and enforcing a certain structure in the subclasses.

//  */