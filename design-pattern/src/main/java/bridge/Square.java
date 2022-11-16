package bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a square and %s", color.fill());
    }
}
