package movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieRepoTest {
    private MovieRepo repo = MovieRepo.getInstance();

    @Test
    public void test() {
        assertEquals(4, repo.getMovies().size());
    }

    @Test
    public void testGetMovieByDirecotry() {
        assertEquals(4, repo.getMoviesByDirectoy("Java").size());
        assertEquals(4, repo.getMoviesByDirectoy("General").size());
    }

    @Test
    public void testGetMovieByGenre() {
        assertEquals(4, repo.getMoviesByDiGenre("Genre_1").size());
        assertEquals(4, repo.getMoviesByDiGenre("Genre_2").size());
    }

    @Test
    public void testFindMovieById() {
        assertEquals(1, repo.getMovieById(1).getId());
        assertEquals(2, repo.getMovieById(2).getId());
        assertEquals(3, repo.getMovieById(3).getId());
    }

    @Test
    public void testDeleteMovieById() {
        assertEquals(4, repo.getMovies().size());
        repo.deleteMovieById(1);
        assertEquals(3, repo.getMovies().size());
    }

    @Test
    public void testAddMovie() throws Exception {
        Movie myMovie = new Movie(13, "The Sky", 2020, "Testing");
        assertEquals(4, repo.getMovies().size());
        repo.addMovie(myMovie);
        assertEquals(5, repo.getMovies().size());
    }

    @Test
    public void testAddMovieException() throws Exception {
        Movie myMovie = new Movie(13, "The Sky", 2020, "Testing");
        repo.addMovie(myMovie);

        Exception e = Assertions.assertThrows(Exception.class, () -> {
            repo.addMovie(myMovie);
        });
    }
}