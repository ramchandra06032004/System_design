// import java.util.HashMap;

// interface VideoDownloader{
//     String downloadVideo(String url);
// }


// class VideoDownloaderProxy implements VideoDownloader{
//     private static HashMap<String, String> cache = new HashMap<>();
//     private RealVideoDownloader realDownloader;
    
//     public String downloadVideo(String url){
//         if (cache.containsKey(url)) {
//             String video = cache.get(url);
//             System.out.println(video);
//             return video;
//         } else {
//             if (realDownloader == null) {
//                 realDownloader = new RealVideoDownloader();
//             }
//             String video = realDownloader.downloadVideo(url);
//             cache.put(url, video);
//             System.out.println(video);
//             return video;
//         }
//     }
// }
// class RealVideoDownloader implements VideoDownloader{
//     public String downloadVideo(String url){
//         System.out.println("downloading video from " + url);
//         return "video content from " + url;
//     }
// }




// public class Main {

//     public static void main(String[] args) {
//         VideoDownloaderProxy x=new VideoDownloaderProxy();
//         x.downloadVideo("system design");
//         VideoDownloaderProxy x1=new VideoDownloaderProxy();
//         x1.downloadVideo("system design");
//         VideoDownloaderProxy x2=new VideoDownloaderProxy();
//         x2.downloadVideo("system design");

//     }
// }

// /*
//  in the above code, we have created a VideoDownloader interface and two classes: VideoDownloaderProxy and RealVideoDownloader.
// The VideoDownloaderProxy class acts as a proxy for the RealVideoDownloader class. It caches the downloaded videos in a HashMap to avoid redundant downloads.
// The RealVideoDownloader class implements the VideoDownloader interface and simulates the downloading of a video from a given URL.
// This is a simple example of caching in system design using the Proxy Design Pattern.
// This is an example of caching in system design using the Proxy Design Pattern.

//  */