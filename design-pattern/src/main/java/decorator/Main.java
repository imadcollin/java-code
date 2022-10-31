package decorator;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bike(new VehicleImpl());

        v1.clacMaxWieght();

        System.out.println(v1.getName("v1"));
        System.out.println(v1.clacMaxWieght());
        ;
        Vehicle v2 = new Car(new VehicleImpl());

        v1.clacMaxWieght();

        System.out.println(v2.getName("v2"));
        System.out.println(v2.clacMaxWieght());
        ;

    }
}
