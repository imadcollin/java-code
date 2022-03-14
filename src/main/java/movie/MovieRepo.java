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
        m1.setDirectors(getListOFDir());
        m2.setDirectors(Arrays.asList(new Director(1, "Java", "Pro"), new Director(1, "C", "Pro")));
        m3.setDirectors(Arrays.asList(new Director(1, "Pizza", "Cook"), new Director(1, "Salad", "Cook")));
        movies.addAll(Arrays.asList(m1, m2, m3, m4));
        return movies;
    }

    public List<Director> getListOFDir() {
        List<Director> list = new ArrayList<>();
        Director d1 = new Director(1, "Pop", "General");
        Director d2 = new Director(2, "Classic", "General");
        Director d3 = new Director(3, "Jazz", "General");
        Director d4 = new Director(4, "Melody", "General");
        list.addAll(Arrays.asList(d1, d2, d3, d4));
        return list;
    }

    public Movie getMovieById(int id) {
        return getMovies().stream().filter(x -> x.getId() == id).findAny().get();
    }

    public void deleteMovieById(int id) {
        movies = getMovies().stream().filter(x -> x.getId() != id).collect(Collectors.toList());
    }
}
