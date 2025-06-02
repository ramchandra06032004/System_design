// class EmailNotificationSender {
//     public void send(String message, String to) {
//         System.out.println("Rate limit check");
//         System.out.println("Validating phone number");
//        
//         String formatted = message.trim();
//         System.out.println("Logging before send message    " + message + " is formatted to " + formatted);
//         String composedMessage = "[EMAIL] " + formatted;
//         System.out.println("sending Notification to " + to + " with Email :- "+composedMessage);
//         System.out.println("Custom Analytics for "+to);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         EmailNotificationSender o=new EmailNotificationSender();
//         o.send( "                    Welcome to Leetcode","rajumulik51@gmail.com");
//     }
// }
// /*
//  now in above code problem is that consider tomorrow we want to send new type of notification like whatsapp notification
//  and the developer who write code for it i have to enforce him to write the certain steps like
// 1. Rate limit check
// 2. Validating phone number
// 3. Logging before send message
// 4. Custom Analytics
// So we can use Template Method Design Pattern to solve this problem currently we are repeating the same code in every notification sender class
// and might that developer skip some of the steps and it will lead to bugs in the code
// // Template Method Design Pattern
// Template Method Design Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
// This pattern is useful when you have a common algorithm that needs to be implemented in different ways, allowing for code reuse and enforcing a certain structure in the subclasses.
//  */