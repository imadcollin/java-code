package compopition;

public class Composition {

    static class Person {
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public void print(Person p) {
            System.out.println(p.name + " : " + p.age);
        }
    }

    static class Student {
        private Person person;
        private double grade;

        public Student(Person p, double grade) {
            this.person = p;
            this.grade = grade;
        }

        public void print() {
            System.out.println(person.name + " - " + person.age + " - " + grade);
        }

    }

    public static void main(String[] args) {
        Person person = new Person(12, "Adam");
        Student student = new Student(person, 64);
        person.print(person);

        student.print();
    }
}
