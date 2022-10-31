package decorator;

public class Car extends VehicleDec {
    public Car(Vehicle vehicle) {
        super(vehicle);
    }

    private Vehicle vehicle;

    @Override
    public String getName(String name) {
        return vehicle.getName(name);
    }

    @Override
    public double clacMaxWieght() {
        return vehicle.clacMaxWieght();
    }
}
