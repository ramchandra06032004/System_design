// import java.util.ArrayList;
// import java.util.List;

// class User{
//     List<User> friends;
//     private String name;
    
//     User(String _name){
//         this.name=_name;
//         this.friends=new ArrayList<>();
//     }

//     public void addFriend(User friend){
//         this.friends.add(friend);
//     }
//     public List<User> getAllFriend(){
//         return this.friends;
//     }
//     public void brodCastMessage(String message){
//         for(User x:friends){
//             x.acceptMessage(message, this);
//         }
//     }
//     public void acceptMessage(String message,User friend){
//         System.out.println(message+" Sended from "+friend.name);
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         User sahil=new User("Sahil");
//         User raju=new User("raju");
//         User moksh=new User("moksh");
//         User Vishvesh=new User("Vishvesh");
        
//         raju.addFriend(Vishvesh); 
//         raju.addFriend(moksh); 
//         raju.addFriend(sahil);
//         //System.out.println(raju.getAllFriend());
        
//         raju.brodCastMessage("I post a photo on insta");
//     }
// }

// /*
//  in above code problem each user has reference to all his friends and can send message to all his friends
//  adding and removing friends is break the structure of the code
//  hard to orchestrate the role like admin, user, moderator etc
//  difficult to manage permissions and access control
//  to address all this issues we can use mediator pattern
// Mediator pattern is a behavioral design pattern that allows objects to communicate with each other without knowing about each other's implementation details. It promotes loose coupling between objects by introducing a mediator object that handles the communication between them.
// The mediator acts as a central hub through which all communication occurs, allowing objects to interact without being directly aware of each other. This pattern is particularly useful in scenarios where multiple objects need to collaborate or communicate, but you want to avoid tight coupling between them.
//  */