package Maps;

import java.util.*;
import java.util.stream.Collectors;

public class Maping {
    public Map<String, Integer> myMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        return map;

    }

    public Optional<Integer> getValue(String key) {
        Optional<Integer> optional = myMap().entrySet().stream().filter(x -> x.getKey().equals(key)).map(Map.Entry::getValue).findFirst();
        return Optional.of(optional.orElse(0));
    }

    public Map<Integer, Student> fetchStudents() {
        Map<Integer, Student> map = new HashMap<>();

        map.put(1, new Student(14, "Alice"));
        map.put(2, new Student(44, "Alice"));
        map.put(3, new Student(33, "Bob"));
        map.put(4, new Student(55, "Eva"));
        return map;
    }

    public Map<Integer, Student> fetchStudentsWithoutSpcificName(Map<Integer, Student> map, String name) {
        Map<Integer, Student> mapWithSpecificNames = new HashMap<>();
        for (Map.Entry<Integer, Student> entry : map.entrySet()
        ) {
            if (entry.getValue().getName().equals(name)) mapWithSpecificNames.put(entry.getKey(), entry.getValue());

        }
        return mapWithSpecificNames;
    }

    public Map<Integer, Student> fetchStudentsWithoutSpcificName2(Map<Integer, Student> map, String name) {
        return map.entrySet().stream().filter(x -> name.equalsIgnoreCase(x.getValue().getName())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

    public int mapGetFirst(Map<Integer, Student> map, String name) {

        return map.entrySet().stream().anyMatch(s -> s.getValue().getName().equals(name)) ? 1 : 0;
    }

    public int mapGetFirstWithIterator(Map<Integer, Student> map, String name) {
        Iterator<Map.Entry<Integer, Student>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().getName().equals(name))
                return 1;

        }
        return -1;
    }
}

