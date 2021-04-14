import java.io.Serializable;
import java.util.Date;

public class Albums implements Serializable {


    public Albums(short id, String artist, String albumName, Date releaseDate, double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    private short id;
    private String artist;
    private String albumName;
    private Date releaseDate;
    private double sales;
    private String genre;




    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
