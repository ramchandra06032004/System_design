// import java.util.ArrayList;
// import java.util.List;

// interface User{
//     void acceptMessage(String message,User sender);
//     String getName();
//     void sendMessage(String message);
// }
// interface DocumentSesionMediator{
//     void join(User user);
//     void brodcastMessage(User sender,String message);
// }

// class NormalUser implements User{
//     private String name;
//     private DocumentSesionMediator mediator;
//     NormalUser(String _name,DocumentSesionMediator _mediator){
//         this.name=_name;
//         this.mediator=_mediator;
//         _mediator.join(this);
//     }
//     public String getName(){
//         return this.name;
//     }
//     public void sendMessage(String message){
//         mediator.brodcastMessage(this, message);
//     }
//     public void acceptMessage(String message,User sender){
//         System.out.println(message +"   from    "+sender.getName());
//     }

// }


// class SampleMediator implements DocumentSesionMediator{
//     List<User> users;
//     SampleMediator(){
//         this.users=new ArrayList<>();
//     }
//     public void join(User user){
//         users.add(user);
//         //System.out.println(users);
//     }
//     public void brodcastMessage(User sender,String message){
//         for(User x:users){
//             if (x!=sender && x instanceof NormalUser) {
//                 x.acceptMessage(message, sender);
//             }
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         DocumentSesionMediator mediator=new SampleMediator();
//         User sahil=new NormalUser("Sahil",mediator);
//         User raju=new NormalUser("raju",mediator);
//         User moksh=new NormalUser("moksh",mediator);
//         User vishvesh=new NormalUser("Vishvesh",mediator);

//         raju.sendMessage("hello i post a photo");
//     }
// }
// /*
//  in above code we have created a mediator interface DocumentSesionMediator which has methods to join users and brodcast message
//  now each user does not have reference to all his friends and can send message to all his friends
//     this makes the code more flexible and easy to maintain
//     also we can easily add new roles like admin, moderator etc by creating new classes that implement the User interface
// This allows us to manage permissions and access control more effectively.
// // This is a simple implementation of the Mediator Pattern in Java.

//  */