package fly.wieght;

public class Main {
    public static void main(String[] args) {

        ThickPen thickPen = (ThickPen) PenFactory.getPen("Green");

        thickPen.draw(Brush.LARGE);

        ThickPen thickPen12 = (ThickPen) PenFactory.getPen("Green");
        thickPen12.draw(Brush.LARGE);

        ThinPen thinPen = (ThinPen) PenFactory.getPen2("Red");
        thinPen.draw(Brush.SMALL);

        System.out.println(thickPen.hashCode());
        System.out.println(thickPen12.hashCode());
    }
}
