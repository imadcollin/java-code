package streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Streamer {
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    public Stream<String> collection(Collection<String> collection) {
        return collection.stream();
    }

    public Stream<String> builder(String a, String b) {
        return Stream.<String>builder().add(a).add(b).build();
    }
}
