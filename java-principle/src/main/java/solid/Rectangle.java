package solid;

public class Rectangle extends ShapeImp implements IShape {
    public Rectangle(double h, double w) {
        super(h, w);
    }

    @Override
    public double area() {
        return getH() * getW();
    }
}
