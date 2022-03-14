package movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieDao {
    private MovieRepo repo;

    public MovieDao() {
        repo = new MovieRepo();
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
}
