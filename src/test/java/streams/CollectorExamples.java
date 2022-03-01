package streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExamples {

    public List<String> unmodifiedList(List<String> list, String s) {
        List<String> x = list.stream().collect(Collectors.toUnmodifiableList());
        try {
            x.add(s);

        } catch (Exception e) {
            throw new UnsupportedOperationException("Unspported operation");
        }
        return x;
    }

    public List<String> unmodifiedList2(List<String> list, String s) {
        List<String> x = list.stream().collect(Collectors.
                collectingAndThen(Collectors.toList(), Collections::<String>unmodifiableList));
        try {
            x.add(s);

        } catch (Exception e) {
            throw new UnsupportedOperationException("Unspported operation");
        }
        return x;
    }

    public String join(List<String> stringList) {
        return stringList.stream().collect(Collectors.joining());
    }

    public String joinSpaces(List<String> stringList) {
        return stringList.stream().collect(Collectors.joining(" "));
    }
}
