package streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapsStream {
    protected List<String> mapToList(Map<String, String> map) {
        return map.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
    }

    protected Optional<String> getMatch(Map<String, String> map, String lkey) {
        return map.entrySet().stream().filter(x -> x.getKey().equals(lkey)).map(y -> y.getValue()).findFirst();
    }
}
