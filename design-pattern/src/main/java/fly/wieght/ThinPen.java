package fly.wieght;

public class ThinPen implements Pen {
    private String color;
    private Brush brush = Brush.SMALL;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(Brush size) {
        System.out.println("Printing with Pen size: " + size.name());
    }
}
