package streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Streams {

    @Test
    public void setup() {
        List<String> srtList = Arrays.asList("a", "b", "c", "d");

        Optional<String> str = srtList.stream().filter(x -> x.startsWith("c")).map(String::toUpperCase).findAny();
        assertEquals("C", str.orElseThrow(null));

    }

    @Test
    public void looping() {
        List<String> srtList = Arrays.asList("a", "b", "c", "d");

        List<String> listofStrings = srtList.stream().filter(x -> x.startsWith("c")).map(String::toUpperCase)
                .collect(Collectors.toList());
        assertEquals(1, listofStrings.size());
    }

    @Test
    public void is_existed() {
        List<String> srtList = Arrays.asList("a", "b", "c", "d");

        boolean is_existed = srtList.stream().anyMatch(x -> x.startsWith("c"));
        assertTrue(is_existed);
    }

    @Test
    public void find_first() {


        assertTrue(Stream.of(1, 2, 3, 4).findFirst().isPresent());
    }

    @Test
    public void loopingTo() {
        int arr[] = IntStream.range(1, 10).toArray();
        assertEquals(arr.length, 9);
    }

    @Test
    public void avg() {
        assertEquals(Arrays.stream(new int[]{1, 2, 3, 4}).average().orElse(0), 2.5);
    }

    @Test
    public void mapTo() {
        int max_sub = Arrays.stream(new String[]{"a1", "a2", "a3"})
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max().orElse(0);

        assertEquals(max_sub, 3);
    }

    @Test
    public void no_print(){

    }
}
