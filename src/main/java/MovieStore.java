import model.Movie;

import java.util.LinkedList;
import java.util.List;

public class MovieStore {
  List<Movie> movies = new LinkedList<Movie>();
  public List<Movie> findByPartialTitle(String partialTitle) {
    List<Movie> result = new LinkedList<Movie>();
    for (Movie movie : movies) {
      if(movie.title().toUpperCase().contains(partialTitle.toUpperCase())) {
        result.add(movie);
      }
    }
    return result;
  }

  public void add(Movie movie) {
    movies.add(movie);
  }

  public List<Movie> findByDirector(String director) {

  }
}
