package model;

public class Movie {
  private String title;
  private String director;

  public Movie(String title, String director, int i) {
    this.title = title;
    this.director = director;
  }

  public String title() {
    return title;
  }

  public String director() {
    return director;
  }
}
