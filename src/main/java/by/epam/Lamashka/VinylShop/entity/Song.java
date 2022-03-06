package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Song class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Song implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);

  private String songName;
  private String artist;
  private String songDuration;

  /** Constructor for Song. */
  public Song() {
    this.songName = "Unknown";
    this.songDuration = "00:00";
  }

  /**
   * Constructor for Song.
   *
   * @param songName a {@link java.lang.String} object
   */
  public Song(String songName) {
    this.songName = songName;
    this.songDuration = "00:00";
  }

  /**
   * Constructor for Song.
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

  public static AtomicInteger getCount() {
    return count;
  }
  /**
   * Getter for the field <code>songName</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSongName() {
    return songName;
  }

  /**
   * Setter for the field <code>songName</code>.
   *
   * @param songName a {@link java.lang.String} object
   */
  public void setSongName(String songName) {
    this.songName = songName;
  }

  /**
   * Getter for the field <code>songDuration</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSongDuration() {
    return songDuration;
  }

  /**
   * Setter for the field <code>songDuration</code>.
   *
   * @param songDuration a {@link java.lang.String} object
   */
  public void setSongDuration(String songDuration) {
    this.songDuration = songDuration;
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
