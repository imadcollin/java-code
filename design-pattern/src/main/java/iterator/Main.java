package iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C");
        MyIterator iterator = new MyIterator(stringList);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
