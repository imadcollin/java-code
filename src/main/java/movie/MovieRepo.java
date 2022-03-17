package movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieRepo {
    private static List<Movie> movies = new ArrayList<>();
    private static MovieRepo movieRepo;

    public static MovieRepo getInstance() {
        if (movieRepo == null) {
            movieRepo = new MovieRepo();
        }
        return movieRepo;
    }

    MovieRepo() {
        super();
        Init();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void Init() {
        System.out.println("reached");
        Movie m1 = new Movie(1, "Speed fast", 2020, "General");
        Movie m2 = new Movie(2, "The game", 1999, "General");
        Movie m3 = new Movie(3, "End of the life", 1900, "Norm");
        Movie m4 = new Movie(4, "Public people", 2020, "General");
        m1.setDirectors(getListOFDir());
        m2.setDirectors(Arrays.asList(new Director(1, "Java", "Pro"), new Director(1, "C", "Pro")));
        m3.setDirectors(Arrays.asList(new Director(1, "Pizza", "Cook"), new Director(1, "Salad", "Cook")));

        m1.setGenres(getListOFGenre());
        m2.setGenres(Arrays.asList(new Genre(5, "Genre_5"), new Genre(6, "Genre_6")));
        movies.addAll(Arrays.asList(m1, m2, m3, m4));
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

    public List<Genre> getListOFGenre() {
        List<Genre> list = new ArrayList<>();
        Genre g1 = new Genre(1, "Genre_1");
        Genre g2 = new Genre(2, "Genre_2");
        Genre g3 = new Genre(3, "Genre_2");
        Genre g4 = new Genre(4, "Genre_2");
        list.addAll(Arrays.asList(g1, g2, g3, g4));
        return list;
    }

    public Movie getMovieById(int id) {
        return getMovies().stream().filter(x -> x.getId() == id).findAny().get();
    }

    public void deleteMovieById(int id) {
        movies = getMovies().stream().filter(x -> x.getId() != id).collect(Collectors.toList());
    }

    public List<Movie> getMoviesByDirectoy(String dir) {
        return getMovies().stream().map(movie -> {
            movie.getDirectors().stream().filter(director -> director.getName().equals(dir));
            return movie;

        }).collect(Collectors.toList());
    }

    public List<Movie> getMoviesByDiGenre(String genre) {
        return getMovies().stream().map(movie -> {
            movie.getGenres().stream().filter(g -> g.getName().equals(genre));
            return movie;

        }).collect(Collectors.toList());
    }

    public void addMovie(Movie movie) throws Exception {
        if (isExist(movie)) throw new Exception("Already exist...");
        movies.add(movie);
    }

    private boolean isExist(Movie movie) {
        return movies.stream().filter(x -> x.getId() == movie.getId()).findAny().isPresent();
    }
}
