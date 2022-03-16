package movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieRepoTest {
    private MovieRepo repo;

    @BeforeEach
    void setUp() {
        repo = new MovieRepo();
    }

    @Test
    public void test() {
        assertEquals(4, repo.getMovies().size());
    }

    @Test
    public void testGetMovieByDirecotry() {
        assertEquals(4, repo.getMoviesByDirectoy("Java").size());
        assertEquals(8, repo.getMoviesByDirectoy("General").size());
    }

    @Test
    public void testGetMovieByGenre() {
        assertEquals(4, repo.getMoviesByDiGenre("Genre_1").size());
        assertEquals(8, repo.getMoviesByDiGenre("Genre_2").size());
    }

}