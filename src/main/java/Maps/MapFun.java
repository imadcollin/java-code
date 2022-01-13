package Maps;

import org.junit.jupiter.api.Assertions;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFun {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "3");
        List<Point> originalPoints = Arrays.asList(new Point(1, 2),
                new Point(3, 4),
                new Point(5, 6));

        List<Point> scaledPoints = Arrays.asList(new Point(2, 4),
                new Point(6, 8),
                new Point(10, 12));
        Assertions.assertEquals(MapFun.listOfIntegers(stringList).size(), stringList.size());
        Assertions.assertEquals(MapFun.listOfDoubles(stringList).size(), stringList.size());

        Assertions.assertEquals(MapFun.listOfObjects(originalPoints).size(), scaledPoints.size());

        Assertions.assertEquals(MapFun.listOfObjects(originalPoints).get(0).x, 2);
        Assertions.assertEquals(MapFun.listOfObjects(originalPoints).get(0).y, 4);

        Assertions.assertEquals(MapCaps(Arrays.asList("a", "b", "c")).get(0), "A");
        Assertions.assertEquals(MapCaps(Arrays.asList("a", "b", "c")).get(1), "B");
        Assertions.assertEquals(MapCaps(Arrays.asList("a", "b", "c")).get(2), "C");

        Assertions.assertEquals(MapCaps2(Arrays.asList("a", "b", "c")).get(0), "A");
        Assertions.assertEquals(MapCaps2(Arrays.asList("a", "b", "c")).get(1), "B");
        Assertions.assertEquals(MapCaps2(Arrays.asList("a", "b", "c")).get(2), "C");
    }

    public static List<Integer> listOfIntegers(List<String> list) {
        return list.stream().map(Integer::valueOf).collect(Collectors.toList());
    }

    public static List<Double> listOfDoubles(List<String> list) {
        return list.stream().map(Double::valueOf).collect(Collectors.toList());
    }

    public static List<Point> listOfObjects(List<Point> objectList) {
        return objectList.stream().map(n -> new Point(n.x * 2, n.y * 2)).collect(Collectors.toList());
    }

    public static List<String> MapCaps(List<String> map) {
        return map.stream().map(Caps::caps).collect(Collectors.toList());
    }

    public static List<String> MapCaps2(List<String> map) {
        return map.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("x:" + this.x + "--" + this.y);
    }
}

class Caps {
    public static String caps(String s) {
        return s.toUpperCase();
    }
}

