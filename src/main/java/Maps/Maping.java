package Maps;

import java.util.*;
import java.util.stream.Collectors;

public class Maping {
  /*
    public static void main(String[] args) {
        Map<Integer, String> map = Hashmaps();
        Map<Integer, String> map2 = HashTable();
        Map<Integer, String> map3 = treeMap();
        print(map);
        print(map2);
        print(map3);

    }
   */

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

    public static Map<Integer, String> Hashmaps() {
        Map<Integer, String> countries = new HashMap<>();
        countries.put(2, "USA");
        countries.put(1, "SE");
        countries.put(3, "IT");
        return countries;
    }

    public static boolean hasValue(Map<Integer, String> map) {
        return map.containsKey(1);
    }

    public static Map<Integer, String> HashTable() {
        Map<Integer, String> countries = new Hashtable<>();
        countries.put(2, "USA");
        countries.put(1, "SE");
        countries.put(3, "IT");
        return countries;
    }

    public static Map<Integer, String> treeMap() {
        Map<Integer, String> countries = new TreeMap<>();
        countries.put(2, "USA");
        countries.put(1, "SE");
        countries.put(3, "IT");
        return countries;
    }

    public Map<Integer, String> getMap(List<Integer> integerList, List<String> stringList) {
        Map<Integer, String> listListMap = new HashMap<>();
        if (integerList.size() == stringList.size())
            for (int i = 0; i < integerList.size(); i++) {
                listListMap.put(integerList.get(i), stringList.get(i));
            }
        return listListMap;
    }

    public static void print(Map<Integer, String> map) {
        map.entrySet().forEach(System.out::println);
        System.out.println("------------------");
    }

    public static TreeMap<Integer, String> sortMap(Map<Integer, String> map) {
        return new TreeMap<>(map);
    }

    public static LinkedHashMap<Integer, String> sortMap2(Map<Integer, String> map) {

        LinkedHashMap<Integer, String> nh = new LinkedHashMap<>();
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static List<Integer> convertMapKeysToList(Map<Integer, String> map) {
        List<Integer> list = new ArrayList<>(map.keySet());
        return list;
    }

    public static List<String> convetMapToListOfValues(Map<Integer, String> map) {
        List<String> list = new ArrayList<>(map.values());
        return list;
    }

    public static Map<String, String> getmapKeysFromList(List<Map<String, String>> map) {
        Map<String, String> result = new HashMap<>();
        map.stream().forEach(e -> {
            result.putAll(e.entrySet().stream()
                    .collect(Collectors.toMap(entry -> entry.getKey(), entry -> (String) entry.getValue())));
        });
        return result;
    }
}

