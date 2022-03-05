package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;

/**
 * <p>Song class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Song implements Serializable {
  private String songName;
  private String artist;
  private String songDuration;

  /**
   * <p>Constructor for Song.</p>
   */
  public Song() {
    this.songName = "Unknown";
    this.songDuration = "00:00";
  }

  /**
   * <p>Constructor for Song.</p>
   *
   * @param songName a {@link java.lang.String} object
   */
  public Song(String songName) {
    this.songName = songName;
    this.songDuration = "00:00";
  }

  /**
   * <p>Constructor for Song.</p>
   *
   * @param songName a {@link java.lang.String} object
   * @param artist a {@link java.lang.String} object
   * @param songDuration a {@link java.lang.String} object
   */
  public Song(String songName, String artist, String songDuration) {
    this.songName = songName;
    this.songDuration = songDuration;
    this.artist = artist;
  }

  /**
   * <p>Getter for the field <code>songName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSongName() {
    return songName;
  }

  /**
   * <p>Setter for the field <code>songName</code>.</p>
   *
   * @param songName a {@link java.lang.String} object
   */
  public void setSongName(String songName) {
    this.songName = songName;
  }

  /**
   * <p>Getter for the field <code>songDuration</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSongDuration() {
    return songDuration;
  }

  /**
   * <p>Setter for the field <code>songDuration</code>.</p>
   *
   * @param songDuration a {@link java.lang.String} object
   */
  public void setSongDuration(String songDuration) {
    this.songDuration = songDuration;
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return "Song{"
        + "songName='"
        + songName
        + '\''
        + ", artist='"
        + artist
        + '\''
        + ", songDuration='"
        + songDuration
        + '\''
        + '}';
  }
}
