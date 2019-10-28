/**
 * @(#)SongLab1.java
 *
 *
 * @author 
 * @version 1.00 2014/7/29
 */
//DO NOT MODIFY THIS FILE!!!!!!!!!!!!!!!!!!!!

//ALL of the lines have been commented so that the file will compile.  Remove
// the comments one line at a time as you work

public class SongLab1 {

    public static void main(String args[]) 
    {
    	Song mySong = new Song("Red House","Jimi Hendrix", 3.73);
    	System.out.println("mySong's artist is: "+mySong.getArtist());
    	System.out.println("It has been downloaded "+mySong.numDownloaded()+" times");
    	System.out.println();
    	mySong.download();
    	mySong.download();
    	mySong.download();
    	mySong.download();
    	System.out.println("Now it has been downloaded "+mySong.numDownloaded()+" times");
    	System.out.println(mySong.summary());
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	Song yourSong = new Song("Let's Go Crazy", "Prince", 3.77);
    	System.out.println(yourSong.getTitle()+" is sung by "+yourSong.getArtist());
    	System.out.println();
    	yourSong.changeArtist("the artist formerly known as Prince");
    	System.out.println(yourSong.getTitle()+" is sung by "+yourSong.getArtist());
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	Song genericSong = new Song();
    	System.out.println("generic title: "+genericSong.getTitle());
    	System.out.println("generic artist: "+genericSong.getArtist());
    	System.out.println("generic length: "+genericSong.getLength());
    	System.out.println("generic downloads: "+genericSong.numDownloaded());
    	System.out.println();
    	genericSong.changeLength(2.94);
    	System.out.println("generic summary: "+genericSong.summary());
    	
    	
    	
    }
    
    
}