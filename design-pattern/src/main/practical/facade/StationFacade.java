package facade;

public class StationFacade {

    public StationFacade(Rocket rocket, Destination destination) {
        this.rocket = rocket;
        this.destination = destination;
    }

    private Rocket rocket;
    private Destination destination;
    private boolean mission;


    public STATUS missionStarter() {
        if (rocket.rocketStatus() && destination.destenationStatus()) {
            rocket.fly();
            return STATUS.SUCCESS;
        } else
            missionCancelation();
        return STATUS.FAIL;

    }


    public void missionCancelation() {
        this.rocket.rocketStop();
    }

    public enum STATUS {
        SUCCESS, FAIL
    }
}
