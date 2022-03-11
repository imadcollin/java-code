package movie;

import org.junit.jupiter.api.BeforeAll;

class MovieDaoTest {
    public static MovieDao movieDao;

    @BeforeAll
    static void init() {
        movieDao = new MovieDao();
    }

}