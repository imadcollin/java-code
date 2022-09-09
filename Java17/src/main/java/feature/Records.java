package feature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class Records {

    record Student(String name, int age){
        public static String King = "KING";
        public Student{
            Objects.requireNonNull(name);
            Objects.requireNonNull(age);
        }
        public  String getName(){
            return this.name;
        }
    }

    @Test
    public void testStudentRecord(){
        Student student = new Student("Bob", 25 );

        Assertions.assertEquals(25, student.age);
        Assertions.assertEquals("Bob", student.name);
    }

    @Test
    public void testStudentRecordGetNAme(){
        Student student = new Student("Bob", 25 );

        Assertions.assertEquals("Bob", student.getName());
    }

    @Test
    public void testStudentRecordStaticValue(){
        Student student = new Student("Bob", 25 );

        Assertions.assertEquals("KING", student.King);
    }
}
