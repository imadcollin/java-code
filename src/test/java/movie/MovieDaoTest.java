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

}