package movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieRepoTest {
    private MovieRepo repo;

    @BeforeEach
    public void setup() {
        repo = new MovieRepo();
        repo.Init();
    }

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

    @Test
    void testEditMovie() throws Exception {
        assertEquals(4, repo.getMovies().size());

        repo.editMovie(new Movie(1, "test", 2020, "General"));

        assertEquals(4, repo.getMovies().size());
        assertEquals("test", repo.getMovies().stream().filter(x -> x.getTitle().equals("test")).findAny().get().getTitle());
        Exception e = Assertions.assertThrows(NoSuchElementException.class, () -> {

            repo.getMovies().stream().filter(x -> x.getTitle().equals("Speed fast")).findAny().get().getTitle();
        });
    }

    @Test
    void testGetMOvieByGenre() {
        assertEquals(1, repo.getMOviesByGenre("Genre_1").size());
        assertEquals(3, repo.getMOviesByGenre("Genre_2").size());
    }

    @Test
    void testGetMOvieByGenrStream() {
        assertEquals(2, repo.getMOviesByGenreStream("Genre_1").size());
        assertEquals(2, repo.getMOviesByGenreStream("Genre_2").size());
    }

    @Test
    void testGetMoviesByDir() {
        assertEquals(1, repo.getMViesByDirectories("Java").size());
    }

    @Test
    void testGetMoviesByDirStream() {
        assertEquals(1, repo.getMViesByDirectoriesStream("Java").size());
    }
}