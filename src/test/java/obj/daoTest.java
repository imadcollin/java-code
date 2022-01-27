package obj;

import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    public void addStudentsByAges() {
        Student student1 = new Student(22, "Adam");
        Student student2 = new Student(24, "Louis");
        Student student3 = new Student(28, "Noa");
        Student student4 = new Student(44, "Adam");
        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
        School school1 = new School("school_one", School.Phase.PRIMARY);
        School school2 = new School("school_two", School.Phase.SCONDRY);
        School school3 = new School("school_three", School.Phase.UNIVERSITY);

        List<School> schoolList = Arrays.asList(school1, school2, school3);
        Dao dao = new Dao();
        assertEquals(3, dao.addStudByAges(schoolList, studentList).size());
        assertEquals("school_two", dao.addStudByAges(schoolList, studentList).get(1).getName());
        assertEquals("school_three", dao.addStudByAges(schoolList, studentList).get(2).getName());

        assertEquals("Adam", dao.addStudByAges(schoolList, studentList).get(2).getStudents().get(0).getName());
        assertEquals(1, dao.addStudByAges(schoolList, studentList).get(2).getStudents().size());
    }

    @Test
    public void mapStudnets() {

        Map<Integer, String> map = new HashMap<>();
        Dao dao = new Dao();

        map.put(1, "Lamm");
        map.put(2, "Soul");
        map.put(3, "Nancy");
        map.put(4, "Koma");
        assertEquals(4, dao.mapStudents(map).size());
        assertEquals("Lamm", dao.mapStudents(map).get(0).getName());
        assertEquals(1, dao.mapStudents(map).get(0).getId());
        assertEquals("Koma", dao.mapStudents(map).get(3).getName());
        assertEquals(1, dao.mapStudents(map).get(0).getId());
    }

    @Test
    public void ListofListToOneList() {
        Dao dao = new Dao();
        Student student1 = new Student(22, "Adam");
        Student student2 = new Student(24, "Louis");
        Student student3 = new Student(28, "Noa");
        Student student4 = new Student(44, "Adam");

        List<Student> studentList = Arrays.asList(student1, student2);
        List<Student> studentList2 = Arrays.asList(student3, student4);
        List<List<Student>> students = new ArrayList<>();
        students.add(studentList);
        students.add(studentList2);

        assertEquals(4, dao.convert2D_List(students).size());
        assertEquals("Adam", dao.convert2D_List(students).get(0).getName());
        assertEquals("Louis", dao.convert2D_List(students).get(1).getName());
        assertEquals("Noa", dao.convert2D_List(students).get(2).getName());

    }


}