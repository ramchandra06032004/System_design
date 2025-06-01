// import java.beans.Visibility;
// import java.util.ArrayList;
// import java.util.List;

// class Video{
//     private String title;
//     Video(String _title){
//         this.title=_title;
//     }

//     public String getTitle(){
//         return this.title;
//     }
// }

// class YoutubePlaylist{
//     private List<Video> playList;
//     YoutubePlaylist(){
//         playList=new ArrayList<>();
//     }
//     public void addVideo(Video v){
//         this.playList.add(v);
//     }
//     public List getPlayList(){
//         return this.playList;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         YoutubePlaylist o=new YoutubePlaylist();
//         o.addVideo(new Video("System design"));
//         o.addVideo(new Video("DSA A to Z sheet"));
//         o.addVideo(new Video("CP sheet codeforces"));

//         List<Video> plaList=o.getPlayList();
//         for(Video x:plaList){
//             System.out.println(x.getTitle());
//         }
//     }
// }

// /*
//  in above code we have created a class Video which has a title and a class YoutubePlaylist which has a list of videos.
//  there are several problems with this code:
//  1) client needs to know about the implementation details of the YoutubePlaylist class.
//     2) client can modify the playlist by adding or removing videos.
//     3) client needs to write iteration logic to get the videos from the playlist.

// the industry standard solution to this problem is to use the iterator design pattern.
// // The iterator design pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
// the main goal is client should not know about the implementation details of the YoutubePlaylist class.
// and logic of iteration should be handled by the YoutubePlaylist class itself.
// consider i have to remove copyright issues from the video title. so i will create a new class called VideoIterator which will handle the iteration logic.

//  */