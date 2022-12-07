package solid;

public class Square extends ShapeImp implements IShape {
    public Square(double h, double w) {
        super(h, w);
    }

    @Override
    public double area() {
        return Math.pow(getH() * getW(),2);
    }


}

