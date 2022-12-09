package compopition;

public class Inheritance {

    static class Person {
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public void print(Person p) {
            System.out.println(p.name + " : " + age);
        }
    }

    static class Student extends Person {
        private double grade;

        public Student(int age, String name, double grade) {
            super(age, name);
            this.grade = grade;
        }

    }

    public static void main(String[] args) {
        Person person = new Person(12, "Adam");
        Student student = new Student(14, "Eva", 64);
        person.print(person);
        student.print(student);
    }
}
