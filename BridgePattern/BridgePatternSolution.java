

// interface VideoQuality{
//     void load(String title);
// }
// class HdQuality implements VideoQuality{
//     public void load(String title){
//         System.out.println("Loading " + title + " in HD quality.");
//     }
// }
// class K8Quality implements VideoQuality{
//     public void load(String title){
//         System.out.println("Loading " + title + " in 8k quality.");
//     }
// }
// class K4Quality implements VideoQuality{
//     public void load(String title){
//         System.out.println("Loading " + title + " in 4k quality.");
//     }
// }

// abstract class Device{
//     VideoQuality quality;
//     Device(VideoQuality _quality){
//         this.quality=_quality;
//     }
//     abstract void play(String title);
// }

// class Mobile extends Device{
//     Mobile(VideoQuality _quality){
//         super(_quality);
//     }
//     public void play(String title){
//         quality.load(title);
//         System.out.println("Playing  on Mobile.");
//     }
// }
// class Computer extends Device{
//     Computer(VideoQuality _quality){
//         super(_quality);
//     }
//     public void play(String title){
//         quality.load(title);
//         System.out.println("Playing  on Computer.");
//     }
// }
// class TVPlayer extends Device{
//     TVPlayer(VideoQuality _quality){
//         super(_quality);
//     }
//     public void play(String title){
//         quality.load(title);
//         System.out.println("Playing  on TV.");
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         Mobile o=new Mobile(new K4Quality());
//         o.play("Sanam teri kasam");
//     }
// }


// /*
//  in above code i decoupled the video quality from the device.
// This allows us to change the video quality without changing the device code.
// This is an example of the Bridge Design Pattern.
// this is now scalable. and we can add more video qualities and devices without changing the existing code.
// This is a simple example of the Bridge Design Pattern.
//  */