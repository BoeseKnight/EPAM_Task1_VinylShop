package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * VinylRecord class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class VinylRecord implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);

  private List<Song> songs;
  private String artist;
  private String albumName;
  private String genre;
  private String releaseDate;

  /** Constructor for VinylRecord. */
  public VinylRecord() {}

  /**
   * Constructor for VinylRecord.
   *
   * @param songs a {@link java.util.List} object
   */
  public VinylRecord(List<Song> songs) {
    this.songs = songs;
    this.artist = "Unknown";
    this.albumName = "Unknown";
    this.genre = "Unknown";
    this.releaseDate = "Unknown";
  }

  /**
   * Constructor for VinylRecord.
   *
   * @param songs a {@link java.util.List} object
   * @param artist a {@link java.lang.String} object
   * @param albumName a {@link java.lang.String} object
   * @param genre a {@link java.lang.String} object
   * @param releaseDate a {@link java.lang.String} object
   */
  public VinylRecord(
      List<Song> songs, String artist, String albumName, String genre, String releaseDate) {
    this.songs = songs;
    this.artist = artist;
    this.albumName = albumName;
    this.genre = genre;
    this.releaseDate = releaseDate;
  }

  public static AtomicInteger getCount() {
    return count;
  }
  /**
   * Getter for the field <code>artist</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getArtist() {
    return artist;
  }

  /**
   * Setter for the field <code>artist</code>.
   *
   * @param artist a {@link java.lang.String} object
   */
  public void setArtist(String artist) {
    this.artist = artist;
  }

  /**
   * Getter for the field <code>albumName</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getAlbumName() {
    return albumName;
  }

  /**
   * Setter for the field <code>albumName</code>.
   *
   * @param albumName a {@link java.lang.String} object
   */
  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  /**
   * Getter for the field <code>genre</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getGenre() {
    return genre;
  }

  /**
   * Setter for the field <code>genre</code>.
   *
   * @param genre a {@link java.lang.String} object
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

  /**
   * Getter for the field <code>songs</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Song> getSongs() {
    return songs;
  }

  /**
   * Setter for the field <code>songs</code>.
   *
   * @param songs a {@link java.util.List} object
   */
  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }

  /**
   * Getter for the field <code>releaseDate</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getReleaseDate() {
    return releaseDate;
  }

  /**
   * Setter for the field <code>releaseDate</code>.
   *
   * @param releaseDate a {@link java.lang.String} object
   */
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public String toString() {
    return "VinylRecord{"
        + "songs="
        + songs
        + ", artist='"
        + artist
        + '\''
        + ", albumName='"
        + albumName
        + '\''
        + ", genre='"
        + genre
        + '\''
        + ", releaseDate='"
        + releaseDate
        + '\''
        + '}';
  }
}
