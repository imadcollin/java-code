package fly.wieght;

import java.util.HashMap;
import java.util.Map;

public class PenFactory {
    static Map<String, Pen> map = new HashMap<>();

    public static Pen getPen(String color) {
        Pen pen = map.get(color);

        if (pen != null) {
            return pen;
        } else {

            pen = new ThickPen();
            pen.setColor(color);
            map.put(color, pen);
        }
        return map.get(color);
    }


    public static Pen getPen2(String color) {
        Pen pen = map.get(color);

        if (pen != null) {
            return pen;
        } else {

            pen = new ThinPen();
            pen.setColor(color);
            map.put(color, pen);
        }
        return map.get(color);
    }
}
