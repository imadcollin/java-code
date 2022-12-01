package adapter;

public class Main {
    public static void main(String[] args) {
        Charger charger = new Charger("apple");
        charger.charge();
        charger.comsumptionMeasuer();

        charger = new Charger("ios");
        charger.charge();

        charger = new Charger("nokia");
        charger.charge();
        charger.comsumptionMeasuer();
    }
}
