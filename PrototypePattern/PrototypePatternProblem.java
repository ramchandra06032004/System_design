//Prototype pattern problem
// interface EmailTemplate{
//     void setContent(String content);
//     void send();
// }

// class WelcomeEmail implements EmailTemplate{
//     private String content;
//     private String subject;

//     WelcomeEmail(){
//         this.content="Welcome to my platform";
//         this.subject="Welcome email thanks for register";
//     }

//     public void setContent(String _content){
//         this.content=_content;
//     }

//     public void send(){
//         System.out.println("email sent with content: "+this.content+" and subject: "+this.subject);
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         WelcomeEmail o=new WelcomeEmail();
//         o.setContent("Welcome to my platform, we are glad to have you");
//         o.send();

//     }
// }

// /*
// The prototype pattern is a creational design pattern that allows you to create new objects by copying an existing object, known as the prototype. This pattern is useful when creating new instances of a class is expensive or time-consuming, and you want to avoid the overhead of creating a new object from scratch.

// this reduces the computation time and memory usage, as you can create new objects by copying an existing one instead of creating a new one from scratch. This is particularly useful in scenarios where the object creation process is complex or involves a lot of resources.

// if we are dooing database calls while creating an object, we can use the prototype pattern to create a new object by copying an existing one instead of creating a new one from scratch. This can help reduce the overhead of creating a new object and improve performance.
//  */