package DS.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CollectionSort {
    
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<Song> ();
        // for(int i = 0 ; i< 10 ; i++){
        //     int strLen = (int) (Math.random()*(5-2)+2);

        //     String title = "";
        //     String album = "";
        //     String artist ="";

        //     for (int j =0 ; j< strLen ;j++ ){
        //         int titleN =  (int) (Math.random()*(65 + 26 - 65) + 65);
        //         title = title + String.valueOf((char) titleN);

        //         int albumN =  (int) (Math.random()*(65 + 26 - 65) + 65);
        //         album = album + String.valueOf((char) albumN);

        //         int artistN =  (int) (Math.random()*(65 + 26 - 65) + 65);
        //         artist = artist + String.valueOf((char) artistN);
                
        //     }
        //     songs.add(new Song(title, artist, album));

        // }

        songs.add(new Song("title", "artist", "album"));
        songs.add(new Song("ABCD", "cdrf", "hkh"));
        songs.add(new Song("ghuhbnjh", "ujhn", "kjnijnk"));
        songs.add(new Song("title", "artist", "album"));
        songs.add(new Song("adfkk", "asdsa", "ijjnjn"));

        System.out.println("Before sorting \n" + songs);
        Collections.sort(songs);
        System.out.println("After default sorting \n" + songs);

        class TitleCompare implements Comparator<Song>{
            public int compare(Song a, Song b){
                return a.getTitle().compareTo(b.getTitle());
            }
        }
        class ArtistCompare implements Comparator<Song>{
            public int compare(Song a, Song b){
                return a.getArtist().compareTo(b.getArtist());
            }
        }
        class AlbumCompare implements Comparator<Song>{
            public int compare(Song a, Song b){
                return a.getAlbum().compareTo(b.getAlbum());
            }
        }
        //Comparator<? super Song> c = 
        Collections.sort(songs, new TitleCompare());
        System.out.println("After TitleCompare sorting \n" + songs);

        Collections.sort(songs, new ArtistCompare());
        System.out.println("After ArtistCompare sorting \n" + songs);

        Collections.sort(songs, new AlbumCompare());
        System.out.println("After AlbumCompare sorting \n" + songs);

        HashSet<Song> songsSet = new HashSet<>();
        songsSet.addAll(songs );


        System.out.println("songsSet = \n" + songsSet);

        

    }


}


class Song implements Comparable<Song>{
    String title;
    String artist;
    String album;

    public Song(String title,String artist,String album){
        this.title = title;
        this.artist = artist;
        this.album = album;
    }
    
    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return title + " " + artist + " " + album;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Song o) {
        // TODO Auto-generated method stub
        return title.compareTo(o.getTitle());
    }

    @Override
    public int hashCode(){
        return (title+artist+album).hashCode();

    }
    
    @Override
    public boolean equals(Object song){
        Song s = (Song) song;
        return getTitle().equals(s.getTitle()) && getAlbum().equals(s.getAlbum())&&getArtist().equals(s.getArtist());

    }

}
