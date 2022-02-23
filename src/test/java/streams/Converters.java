package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Converters {
    public List<String> mapValuestoList(Map<String, String> map) {
        return map.values().stream().collect(Collectors.toList());
    }

    public List<String> mapValuestoList2(Map<String, String> map) {
        return map.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
    }

    public List<String> mapValuestoList3(Map<String, String> map) {
        return new ArrayList<>(map.values());
    }

    public List<String> listOfMapToStringList(List<Map<String, String>> mapList) {
        List<String> list = new ArrayList<>();
        for (Map<String, String> map : mapList
        ) {
            for (Map.Entry entry : map.entrySet()
            ) {
                list.add((String) entry.getValue());
            }
        }
        return list;
    }

    public List<String> listOfMapToStringList2(List<Map<String, String>> mapList) {
        return (List<String>) mapList.stream().map(x -> new ArrayList(x.values())).flatMap(List::stream).collect(Collectors.toList());
    }
}
