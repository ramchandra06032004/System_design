// import java.util.ArrayList;
// import java.util.List;

// interface Subscriber{
//     void subscribe(String videoTitle);
// }

// interface Channel{
//     void subscribe(Subscriber subscriber);
//     void unSubscribe(Subscriber subscriber);
//     void notifySubscriber(String video);
// }

// class YoutubeChannel implements Channel{
//     private List<Subscriber> subscribers;
//     private String channelName;
//     YoutubeChannel(String _channelName){
//         this.channelName=_channelName;
//         subscribers=new ArrayList<>();
//     }

//     public void subscribe(Subscriber subscriber){
//         subscribers.add(subscriber);
//     }
//     public void unSubscribe(Subscriber subscriber){
//         subscribers.remove(subscriber);
//     }

//     public void notifySubscriber(String video){
//         for(Subscriber x:subscribers){
//             x.subscribe(video);
//         }
//     }
//     public void uploadVideo(String video){
//         System.out.println(video+" is uploaded on channel "+channelName);
//         notifySubscriber(video);
//     }
// }

// class EmailSubscriber implements Subscriber{
//     private String email;
//     EmailSubscriber(String _email){
//         this.email=_email;
//     }
//     public void subscribe(String videoTitle){
//         System.out.println("Email sent to mail "+email+" of video upload "+videoTitle);
//     }
// }
// class SMSSubscriber implements Subscriber{
//     private String mobile;
//     SMSSubscriber(String _mobile){
//         this.mobile=_mobile;
//     }
//     public void subscribe(String videoTitle){
//         System.out.println("SMS sent to Mobile "+mobile+" of video upload "+videoTitle);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         YoutubeChannel o=new YoutubeChannel("Java Solders");
//         o.subscribe(new EmailSubscriber("rajumulik51@gmail.com"));
//         o.subscribe(new SMSSubscriber("9420822373"));

//         o.uploadVideo("Leetcode Post contest discussion 405");
//     }
// }

// /*
//  in above code, we have implemented the Observer Design Pattern to allow for multiple subscribers to be notified when a new video is uploaded on a YouTube channel.
//  and what problem we solve is
// that we can now have multiple types of subscribers (like EmailSubscriber and SMSSubscriber) that can be notified in different ways when a new video is uploaded.
// This allows for greater flexibility and customization in how notifications are sent to subscribers.
// we can easily add new types of subscribers in the future without changing the existing code, adhering to the Open/Closed Principle of SOLID design principles.
// also there is one to many relationship between the YoutubeChannel and its subscribers, which is a key aspect of the Observer Design Pattern.
// we can also easily unsubscribe a subscriber from the channel, which is another key aspect of the Observer Design Pattern.

// this pattern is not recommended when there is large number of subscribers, as it can lead to performance issues due to the overhead of notifying all subscribers.
// for ex virat kohli has 200 million subscribers, if he uploads a video, it will take a lot of time to notify all the subscribers.
// // In such cases, we can use a more efficient approach like using a message queue or a push notification service to notify subscribers asynchronously.
//  */