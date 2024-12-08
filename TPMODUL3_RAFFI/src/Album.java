import javafx.beans.property.*;

public class Album {
    private final StringProperty albumName = new SimpleStringProperty();
    private final StringProperty artist = new SimpleStringProperty();
    private final IntegerProperty available = new SimpleIntegerProperty();
    private final IntegerProperty total = new SimpleIntegerProperty();

    public Album(String albumName, String artist, int available, int total) {
        this.albumName.set(albumName);
        this.artist.set(artist);
        this.available.set(available);
        this.total.set(total);
    }

    // Getters and Setters
    public String getAlbumName() {
        return albumName.get();
    }

    public void setAlbumName(String value) {
        albumName.set(value);
    }

    public StringProperty albumNameProperty() {
        return albumName;
    }

    public String getArtist() {
        return artist.get();
    }

    public void setArtist(String value) {
        artist.set(value);
    }

    public StringProperty artistProperty() {
        return artist;
    }

    public int getAvailable() {
        return available.get();
    }

    public void setAvailable(int value) {
        available.set(value);
    }

    public IntegerProperty availableProperty() {
        return available;
    }

    public int getTotal() {
        return total.get();
    }

    public void setTotal(int value) {
        total.set(value);
    }

    public IntegerProperty totalProperty() {
        return total;
    }
}
