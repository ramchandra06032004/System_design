
// import java.util.ArrayList;
// import java.util.List;

// interface YoutubePlaylistIterator{
//     Video next();
//     boolean hasNext();
// }

// class NormalIterator implements YoutubePlaylistIterator{
//     private int position;
//     private List<Video> plaList;

//     NormalIterator(List<Video> _playList){
//         this.plaList=_playList;
//     }

//     public boolean hasNext(){
//         if (position<plaList.size()) {
//             return true;
//         }else {
//             return false;
//         }
//     }

//     public Video next(){
//         return hasNext()?plaList.get(position++):null;
//     }
// }
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
//     public List<Video> getPlayList(){
//         return this.playList;
//     }
    
// }
// public class Main {

//     public static void main(String[] args) {
//         YoutubePlaylist playlist=new YoutubePlaylist();
//         playlist.addVideo(new Video("System design"));
//         playlist.addVideo(new Video("DSA sheet"));
//         playlist.addVideo(new Video("CP sheet"));

//         YoutubePlaylistIterator iterator=new NormalIterator(playlist.getPlayList());
//         while (iterator.hasNext()) {
//             System.out.println(iterator.next().getTitle());
//         }
//     }
// }

// /*
// now in above video iterator we have created a class called NormalIterator which implements the YoutubePlaylistIterator interface.
// this class has a position variable which keeps track of the current position in the playlist and a constructor which takes the playlist as an argument.
// but problem is not solved yet i handle only the iteration logic but client still knows about the implementation details of the YoutubePlaylist class.
// // so we will create a new class called VideoIterator which will handle the iteration logic and hide the implementation details of the YoutubePlaylist class.
//  */