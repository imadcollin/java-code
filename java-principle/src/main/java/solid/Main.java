package solid;

public class Main {
    public static void main(String[] args) {
        IShape square = new Square(2, 4);
        System.out.println("Square area: " + square.area());

        IShape rec = new Rectangle(3, 4);
        System.out.println("Rectange Area:" + rec.area());

        IShape circle = new Circle(3, 4);
        System.out.println("Circle Area:" + circle.area());
    }
}
