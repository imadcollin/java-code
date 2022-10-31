package decorator;

public class VehicleImpl implements Vehicle {
    @Override
    public String getName(String name) {
        return "Vehicle name is: ".concat(name);
    }

    @Override
    public double clacMaxWieght() {
        return 0;
    }

}
