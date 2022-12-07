package solid;

public abstract class ShapeImp {
    private double h;

    public ShapeImp(double h, double w) {
        this.h = h;
        this.w = w;
    }

    private double w;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }



}
