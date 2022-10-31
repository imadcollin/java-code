package decorator;

public class Bike extends VehicleDec {
    Vehicle vehicle;

    public Bike(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getName(String name) {
        return vehicle.getName(name);
    }

    @Override
    public double clacMaxWieght() {
        return vehicle.clacMaxWieght();
    }
}
