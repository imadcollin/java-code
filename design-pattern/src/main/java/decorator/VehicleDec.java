package decorator;

public abstract class VehicleDec implements Vehicle {
    private Vehicle vehicle;

    public VehicleDec(Vehicle vehicle) {
        this.vehicle = vehicle;
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
