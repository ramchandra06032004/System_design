// class VideoDownloader{
//     public String downloadVideo(String url){
//         //db calls and all logiic
//         return "Requested Video :- "+url;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         VideoDownloader o1=new VideoDownloader();
//         o1.downloadVideo("system-design");
        
//         VideoDownloader o2=new VideoDownloader();
//         o2.downloadVideo("system-design");



//     }
// }
// /*
//  in above code  we are creating two objects of VideoDownloader class and calling downloadVideo method on both objects.
//  but both objects asking for same video.
//  so we can cache the video in memory and return the same video for both objects.
// This is an example of caching in system design comes under proxy design pattern.
// This is a simple example of caching in system design using the Proxy Design Pattern.
// proxy design pattern is used to control access to an object by providing a surrogate or placeholder for it.
// This can be useful for various reasons, such as lazy loading, access control, or caching.
//  */