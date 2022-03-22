package movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieDaoTest {
    public MovieDao movieDao;
    public MovieRepo repo;

    @BeforeEach
    public void setUp() {
        repo = new MovieRepo();
        movieDao = new MovieDao();
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
        assertEquals(1, movieDao.moviesByDirectories2().get("Pizza"));
        assertEquals(1, movieDao.moviesByDirectories2().get("Java"));
    }

    @Test
    void testMovieByGenre() {
        assertEquals(4, movieDao.genresByDGenre().size());
    }

    @Test
    void testGetListOfGener() {
        assertEquals(6, movieDao.getListOfGenre().size());
        assertEquals("Genre_1", movieDao.getListOfGenre().get(0).getName());
        assertEquals("Genre_2", movieDao.getListOfGenre().get(1).getName());
    }

    @Test
    void testGetListOfDires() {
        assertEquals(8, movieDao.getListOfDirecoties().size());
        assertEquals("Pop", movieDao.getListOfDirecoties().get(0).getName());
        assertEquals("Classic", movieDao.getListOfDirecoties().get(1).getName());
    }
}