package by.epam.Lamashka.VinylShop.Entitiy;

import java.util.List;

public class VinylRecord {
  private List<Song> songs;
  private String artist;
  private String albumName;
  private String genre;
  private String releaseDate;
  private int id;

  public VinylRecord() {}

  public VinylRecord(List<Song> songs) {
    this.songs = songs;
    this.artist = "Unknown";
    this.albumName = "Unknown";
    this.genre = "Unknown";
    this.releaseDate = "Unknown";
  }

  public VinylRecord(
      List<Song> songs, String artist, String albumName, String genre, String releaseDate) {
    this.songs = songs;
    this.artist = artist;
    this.albumName = albumName;
    this.genre = genre;
    this.releaseDate = releaseDate;
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

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public List<Song> getSongs() {
    return songs;
  }

  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public int getId() {
    return id;
  }
}
