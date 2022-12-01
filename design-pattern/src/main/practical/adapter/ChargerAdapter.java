package adapter;

public interface ChargerAdapter extends  AndroidCharger, AppleCharger{
    void charge();
    void comsumptionMeasuer();
}
