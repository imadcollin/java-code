package streams;

import java.util.AbstractMap;
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

    protected List<Teacher> ListObjectExchange(List<Student> students) {
        return students.stream().map(student -> {
            Teacher teacher = new Teacher(student.getId(), student.getName(), student.getAge(), 3500);
            return teacher;
        }).collect(Collectors.toList());
    }

    protected Map<String, Integer> transfer(Map<String, String> map) {
        return map.entrySet().stream().map(x -> new AbstractMap.SimpleEntry<>(
                x.getKey(), Integer.parseInt(x.getValue()))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static class Student {
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        private int id;
        private String name;
        private int age;
    }

    public class Teacher {
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        private String name;

        public Teacher(int id, String name, int age, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        private int age;
        private double salary;
    }
}
