package maps;

import Maps.Maping;
import Maps.Student;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MappingTest {
    private Maping maping;

    @Test
    public void testMap() {
        maping = new Maping();
        assertEquals(1, maping.myMap().get("one"));
        assertEquals(2, maping.myMap().get("two"));
    }

    @Test
    public void testFind() {
        maping = new Maping();
        assertEquals(1, maping.getValue("one").get());
    }

    @Test
    public void studentMapIsNotEmpty() {
        maping = new Maping();
        assertTrue(maping.fetchStudents().size() > 0);
    }

    @Test
    public void studentMapWithoutNames() {
        maping = new Maping();
        int size = maping.fetchStudentsWithoutSpcificName(maping.fetchStudents(), "Alice").size();
        assertEquals(2, size);
    }

    @Test
    public void studentMapWithoutNames2() {
        maping = new Maping();
        int size = maping.fetchStudentsWithoutSpcificName2(maping.fetchStudents(), "Alice").size();
        assertEquals(2, size);
    }

    @Test
    public void findFirstStudent() {
        maping = new Maping();
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(14, "Alice"));
        map.put(2, new Student(44, "Alice"));
        map.put(3, new Student(33, "Bob"));
        map.put(4, new Student(55, "Eva"));
        assertEquals(maping.mapGetFirst(map, "Alice"), 1);
    }

    @Test
    public void findFirstStudentWithIterator() {
        maping = new Maping();
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(14, "Alice"));
        map.put(2, new Student(44, "Alice"));
        map.put(3, new Student(33, "Bob"));
        map.put(4, new Student(55, "Eva"));
        assertEquals(maping.mapGetFirst(map, "Alice"), 1);
    }
}
