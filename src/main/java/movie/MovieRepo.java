package movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieRepo {
    private static List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        Movie m1 = new Movie(1, "Speed fast", 2020, "General");
        Movie m2 = new Movie(2, "The game", 1999, "General");
        Movie m3 = new Movie(3, "End of the life", 1900, "Norm");
        Movie m4 = new Movie(4, "Public people", 2020, "General");
        movies.addAll(Arrays.asList(m1, m2, m3, m4));
        return movies;
    }

    public Movie getMovieById(int id) {
        return getMovies().stream().filter(x -> x.getId() == id).findAny().get();
    }

    public void deleteMovieById(int id) {
        movies = getMovies().stream().filter(x -> x.getId() != id).collect(Collectors.toList());
    }
}
