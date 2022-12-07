package solid;

public class Circle extends ShapeImp implements IShape {
    public Circle(double h, double w) {
        super(h, w);
    }

    @Override
    public double area() {
        return getH() * getW() * Math.PI;
    }
}
