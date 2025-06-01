
// import java.util.ArrayList;
// import java.util.List;

// interface YoutubePlaylistIterator{
//     Video next();
//     boolean hasNext();
// }

// interface AddAlgorithm{
//     YoutubePlaylistIterator iterator();
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

// class YoutubePlaylist implements AddAlgorithm{
//     private List<Video> playList;
//     YoutubePlaylist(){
//         playList=new ArrayList<>();
//     }
//     public void addVideo(Video v){
//         this.playList.add(v);
//     }
//     public YoutubePlaylistIterator iterator(){
//         return new NormalIterator(playList);
//     }
    

    
// }
// public class Main {

//     public static void main(String[] args) {
//         YoutubePlaylist playlist=new YoutubePlaylist();
//         playlist.addVideo(new Video("System design"));
//         playlist.addVideo(new Video("DSA sheet"));
//         playlist.addVideo(new Video("CP sheet"));

//         YoutubePlaylistIterator iterator=playlist.iterator();
//         while (iterator.hasNext()) {
//             System.out.println(iterator.next().getTitle());
//         }
//     }
// }

// /*
//  now we have created an interface called YoutubePlaylistIterator which has two methods next() and hasNext().
//  and all problems are solved now.
// // 1) client does not need to know about the implementation details of the YoutubePlaylist class.
// // 2) client cannot modify the playlist by adding or removing videos.
// // 3) client does not need to write iteration logic to get the videos from the playlist.
// // 4) client can use the iterator to get the videos from the playlist.

// consider i apply DFS or BFS on the playlist to get the videos in a different order.
// // so i will create a new class called DFSIterator which will implement the YoutubePlaylistIterator interface and will handle the iteration logic for DFS.
// client no need to implement the DFS logic in the main method.

//  */