
// class YoutubeChannel{
//     public void notifyUserAboutNewVideo(String Video){
//         System.out.println("New video uploaded: " + Video);
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         YoutubeChannel channel = new YoutubeChannel();
//         channel.notifyUserAboutNewVideo("System Design Tutorial");
//     }
// }

// /*
//  in above code, we have a class YoutubeChannel with a method notifyUserAboutNewVideo that takes a String parameter Video.
//  When the method is called, it prints a message indicating that a new video has been uploaded.

//  problem with this code is that it does not allow for any customization or flexibility in how the notification is sent.
// To improve this, we can use the Observer Design Pattern to allow for multiple observers to be notified when a new video is uploaded.
// We can create an interface called Observer with a method update that takes a String parameter Video.
//  */