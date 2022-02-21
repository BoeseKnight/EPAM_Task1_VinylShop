package by.epam.Lamashka.VinylShop.Entitiy;

public class Song {
  private String songName;
  private String songDuration;
  private Character vinylRecordSide;
  private int id;

  public Song() {
    this.songName = "Unknown";
    this.songDuration = "00:00";
    this.vinylRecordSide = 'A';
  }

  public Song(String songName) {
    this.songName = songName;
    this.songDuration = "00:00";
    this.vinylRecordSide = 'A';
  }

  public Song(String songName, String songDuration, Character vinylRecordSide) {
    this.songName = songName;
    this.songDuration = songDuration;
    this.vinylRecordSide = vinylRecordSide;
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

  public Character getVinylRecordSide() {
    return vinylRecordSide;
  }

  public void setVinylRecordSide(Character vinylRecordSide) {
    this.vinylRecordSide = vinylRecordSide;
  }

  public int getId() {
    return id;
  }
}
