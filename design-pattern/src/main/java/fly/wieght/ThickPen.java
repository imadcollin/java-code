package fly.wieght;

public class ThickPen implements Pen {
    private String color;
    private Brush size =Brush.LARGE;


    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(Brush size) {
        System.out.println("Printing with Pen size: " + size.name());
    }
}

