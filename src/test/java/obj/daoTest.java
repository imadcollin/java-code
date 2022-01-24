package obj;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class daoTest {

    @Test
    public void getStudentsByName() {
        Student student1 = new Student(22, "Adam");
        Student student2 = new Student(24, "Louis");
        Student student3 = new Student(28, "Noa");
        Student student4 = new Student(44, "Adam");
        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
        School school1 = new School("school_one", School.Phase.PRIMARY, studentList);
        Dao dao = new Dao();
        assertEquals(2, dao.getStudentbyName(school1, "adam").size());
    }

    @Test
    public void getStudentsByAge() {
        Student student1 = new Student(22, "Adam");
        Student student2 = new Student(24, "Louis");
        Student student3 = new Student(28, "Noa");
        Student student4 = new Student(44, "Adam");
        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
        School school1 = new School("school_one", School.Phase.SCONDRY, studentList);
        Dao dao = new Dao();
        assertEquals(1, dao.getStudentByAge(school1, 22).size());
    }


}