package by.epam.Lamashka.VinylShop.entity;

public class Song {
  private String songName;
  private String artist;
  private String songDuration;

  public Song() {
    this.songName = "Unknown";
    this.songDuration = "00:00";
  }

  public Song(String songName) {
    this.songName = songName;
    this.songDuration = "00:00";
  }

  public Song(String songName, String songDuration) {
    this.songName = songName;
    this.songDuration = songDuration;
  }

  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  public String getSongDuration() {
    return songDuration;
  }

  public void setSongDuration(String songDuration) {
    this.songDuration = songDuration;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

}
