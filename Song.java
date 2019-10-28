public class Song{
    String title = "new song";
    String composer = "unknown";
    double length = 0.0;
    int downloads = 0;
    public Song(String title, String composer, double length){
        this.title = title;
        this.composer = composer;
        this.length = length;
        this.downloads = 0;
    }
    public Song(){}
    public String getArtist() { return composer; }
    public void changeArtist(String tgt) { composer = tgt; }
    public String getTitle() { return title; }
    public double getLength() { return length; }
    public void changeLength(double tgt) { length = tgt; }
    public int numDownloaded() { return downloads; }
    public void download() { downloads++; }
    public String summary() { return "'" + title + "' by " + composer + "; " + String.valueOf(length); }
}