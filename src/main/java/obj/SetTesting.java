package obj;

import java.util.HashSet;
import java.util.Set;

public class SetTesting {
    public static void main(String[] args) {
        Student student_1 = new Student(21, "Eva");
        Student student_2 = new Student(21, "Eva");
        Student student_3 = new Student(21, "Eva");

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student_1);
        studentSet.add(student_2);
        studentSet.add(student_3);
        studentSet.add(student_2);

        studentSet.forEach(s -> System.out.println(s.getAge() + "-" + s.getName()));

    }
}
