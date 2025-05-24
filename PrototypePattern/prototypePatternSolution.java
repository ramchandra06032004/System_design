//Solution of Prototype pattern problem 

// import java.util.HashMap;

// interface EmailTemplate extends Cloneable{
//     void setContent(String content);
//     void send();
//     EmailTemplate clone();
// }

// class WelcomeEmail implements EmailTemplate{
//     private String content;
//     private String subject;

//     public WelcomeEmail clone(){
//         try {
//             return (WelcomeEmail)super.clone();
//         } catch (Exception e) {
//             throw new RuntimeException("clone failed");
//         }
//     }
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

// class EmailTemplateRegistry{
//     private static final HashMap<String ,EmailTemplate> map=new HashMap<>();
//     static{
//         map.put("welcomeEmail", new WelcomeEmail());
//         //put all types of mails objects
//     }
//     public static EmailTemplate getTemplate(String key){
//         return map.get(key).clone();
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         EmailTemplate o=EmailTemplateRegistry.getTemplate("welcomeEmail");
//         o.setContent("Welcome to my platform, we are glad to have you here!");
//         o.send();

//     }

// }

// /*
//  in above code we have created a prototype pattern for email templates.
// We have an interface EmailTemplate which has methods to set content, send email and clone itself.
// We have a concrete class WelcomeEmail which implements EmailTemplate and provides the implementation for the methods.
// We have an EmailTemplateRegistry class which holds a map of email templates and provides a method to get the template by key.
// This allows us to create new email templates by cloning existing ones and modifying their content without having to create new instances from scratch.
// This is a simple implementation of the Prototype design pattern in Java

//  */
