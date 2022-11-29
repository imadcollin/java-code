package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StationFacadeTest {
    private static StationFacade stationFacade;
    private static Rocket rocket;
    private static Destination destination;

    @Test
    public void init() {
        rocket = new Rocket("Rocket 1", 4000);
        destination = new Destination("Mercury", 3000);
        stationFacade = new StationFacade(rocket, destination);
    }

    @Test
    public void testStationIsSet() {
        assertNotNull(stationFacade);
    }

    @Test
    public void testStarter() {
        assertEquals(StationFacade.STATUS.SUCCESS, stationFacade.missionStarter());
    }

}