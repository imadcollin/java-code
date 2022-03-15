package movie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieDaoTest {
    public static MovieDao movieDao;
    public static MovieRepo repo;

    @BeforeAll
    static void init() {
        movieDao = new MovieDao();
        repo = new MovieRepo();
    }

    @Test
    void testMoviesByDirecotries() {
        assertEquals(4, movieDao.moviesByDirectories().size());
        assertEquals(4, movieDao.moviesByDirectories().get("Speed fast"));
        assertEquals(2, movieDao.moviesByDirectories().get("The game"));
    }

    @Test
    void testMoviesByDirecotrie2s() {
        assertEquals(8, movieDao.moviesByDirectories2().size());
        assertEquals(2, movieDao.moviesByDirectories2().get("Pizza"));
        assertEquals(3, movieDao.moviesByDirectories2().get("Java"));
    }

    @Test
    void testMovieByGenre() {
        assertEquals(4, movieDao.genresByDir().size());
    }
}