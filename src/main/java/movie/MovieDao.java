package movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieDao {
    private MovieRepo repo;

    public MovieDao() {
        repo = new MovieRepo();
        repo.Init();
    }

    //Find the number of movies of each director: Try to solve this problem by assuming that Director class has not the member movies.
    public Map<String, Integer> moviesByDirectories() {
        Map<String, Integer> map = new HashMap<>();
        for (Movie movie : repo.getMovies()
        ) {
            map.put(movie.getTitle(), movie.getDirectors().size());
        }
        return map;

    }

    //Find the number of movies of each director: Try to solve this problem by assuming that Director class has not the member movies.
    public Map<String, Long> moviesByDirectories2() {

        return repo.getMovies().stream().map(Movie::getDirectors).flatMap(List::stream).collect(Collectors.groupingBy(Director::getName, Collectors.counting()));

    }

    //Find the number of genres of each director's movies:
    public Map<String, Long> genresByDGenre() {
        return repo.getMovies().stream().map(Movie::getGenres).flatMap(List::stream).collect(Collectors.groupingBy(Genre::getName, Collectors.counting()));
    }

    public List<Genre> getListOfGenre() {
        return repo.getMovies().stream().map(Movie::getGenres).flatMap(List::stream).collect(Collectors.toList());
    }

    public List<Director> getListOfDirecoties() {
        return repo.getMovies().stream().map(Movie::getDirectors).flatMap(List::stream).collect(Collectors.toList());
    }
}
