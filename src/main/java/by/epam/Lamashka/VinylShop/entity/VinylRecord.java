package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <p>VinylRecord class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class VinylRecord implements Serializable {
  private List<Song> songs;
  private String artist;
  private String albumName;
  private String genre;
  private String releaseDate;

  /**
   * <p>Constructor for VinylRecord.</p>
   */
  public VinylRecord() {}

  /**
   * <p>Constructor for VinylRecord.</p>
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
   * <p>Constructor for VinylRecord.</p>
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

  /**
   * <p>Getter for the field <code>artist</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getArtist() {
    return artist;
  }

  /**
   * <p>Setter for the field <code>artist</code>.</p>
   *
   * @param artist a {@link java.lang.String} object
   */
  public void setArtist(String artist) {
    this.artist = artist;
  }

  /**
   * <p>Getter for the field <code>albumName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAlbumName() {
    return albumName;
  }

  /**
   * <p>Setter for the field <code>albumName</code>.</p>
   *
   * @param albumName a {@link java.lang.String} object
   */
  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  /**
   * <p>Getter for the field <code>genre</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGenre() {
    return genre;
  }

  /**
   * <p>Setter for the field <code>genre</code>.</p>
   *
   * @param genre a {@link java.lang.String} object
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

  /**
   * <p>Getter for the field <code>songs</code>.</p>
   *
   * @return a {@link java.util.List} object
   */
  public List<Song> getSongs() {
    return songs;
  }

  /**
   * <p>Setter for the field <code>songs</code>.</p>
   *
   * @param songs a {@link java.util.List} object
   */
  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }

  /**
   * <p>Getter for the field <code>releaseDate</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getReleaseDate() {
    return releaseDate;
  }

  /**
   * <p>Setter for the field <code>releaseDate</code>.</p>
   *
   * @param releaseDate a {@link java.lang.String} object
   */
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public String toString() {
    return "VinylRecord{" +
            "songs=" + songs +
            ", artist='" + artist + '\'' +
            ", albumName='" + albumName + '\'' +
            ", genre='" + genre + '\'' +
            ", releaseDate='" + releaseDate + '\'' +
            '}';
  }
}
