package bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.printf("Drawning and %s ", color.fill());
    }
}
