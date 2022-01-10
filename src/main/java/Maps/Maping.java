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

    public Map<Integer,Student> mapOfTwoMaps (Map<Integer,Student>map1, Map<Integer,Student>map2){
        return map1.entrySet().stream().map(entry ->map2.put(entry.getKey(),entry.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v,v1)->));

    }
}

class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    ;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}