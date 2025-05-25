

// public interface PlayQuality{
//     void play(String title);
// }

// class Webplayer implements PlayQuality{
//     public void play(String title){
//         System.out.println("Playing " + title + " on web player with HD quality.");
//     }
// }
// class MobilePlayer implements PlayQuality{
//     public void play(String title){
//         System.out.println("Playing " + title + " on mobile player with SD quality.");
//     }
// }
// class TVPlayer implements PlayQuality{
//     public void play(String title){
//         System.out.println("Playing " + title + " on TV with 4K quality.");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         PlayQuality webPlayer = new Webplayer();
//         PlayQuality mobilePlayer = new MobilePlayer();
//         PlayQuality tvPlayer = new TVPlayer();

//         webPlayer.play("Inception");
//         mobilePlayer.play("Inception");
//         tvPlayer.play("Inception");
//     }
// }

// /*
//  in above code quality and player are tightly coupled with each other.
//  if we want to add new quality for mobile then we have to create new class
//  if we want add new player like console player then we have to create new class for every quality.
// This violates the Open/Closed Principle of SOLID design.
// To fix this, we can use the Strategy Pattern to decouple the quality from the player.
// this pattern is called as Bridge Pattern.
//  */ {
    
// }
