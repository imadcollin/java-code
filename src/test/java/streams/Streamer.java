package streams;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

    public Stream<String> generate(String s) {
        return Stream.generate(() -> s).limit(10);
    }

    public List<Integer> iterateByLimit(int i, int i1) {
        return Stream.iterate(i, n -> i + 5).limit(i1).collect(Collectors.toList());
    }

    public IntStream range(int a, int b) {
        return IntStream.range(a, b);
    }

    public Optional<String> findStr(String str) {
        return Stream.of("one", "two", "three").filter(x -> x.contains(str)).findAny();
    }

    public Optional<String> pipesCaps(List<String> list, String str) {
        return list.stream().filter(x -> x.contains(str)).map(y -> y.toUpperCase()).findFirst();
    }

    public int sums(int start, int last) {
        return IntStream.range(start, last).reduce((a, b) -> a + b).orElse(0);
    }
}
