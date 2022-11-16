package bridge;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Green());
        circle.draw();
        System.out.println();
        circle = new Circle(new Blue());
        circle.draw();
    }
}
