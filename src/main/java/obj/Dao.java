package obj;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Dao {
    private List<Student> students = new ArrayList<>();
    private List<School> schools = new ArrayList<>();

    public List<Student> getStudentbyName(School school, String name) {
        if (school.getStudents() != null) {

            return school.getStudents().stream().filter(x -> name.equalsIgnoreCase(x.getName())).collect(Collectors.toList());
        }
        return null;
    }

    public List<Student> getStudentByAge(School school, int age) {
        return school.getStudents().stream().filter(x -> x.getAge() == age).collect(Collectors.toList());
    }

    public List<School> addStudByAges(List<School> schools, List<Student> students) {
        if (students.size() > 0) {
            List<Student> pri = students.stream().filter(student -> student.getAge() > 20 && student.getAge() < 30).collect(Collectors.toList());
            List<Student> sco = students.stream().filter(student -> student.getAge() > 30 && student.getAge() < 40).collect(Collectors.toList());
            List<Student> uni = students.stream().filter(student -> student.getAge() > 40).collect(Collectors.toList());
            schools.stream().filter(x -> x.getLevel() == School.Phase.PRIMARY).forEach(y -> y.setStudents(pri));
            schools.stream().filter(x -> x.getLevel() == School.Phase.SCONDRY).forEach(y -> y.setStudents(sco));
            schools.stream().filter(x -> x.getLevel() == School.Phase.UNIVERSITY).forEach(y -> y.setStudents(uni));
        }
        return schools;
    }

    public List<Student> mapStudents(Map<Integer, String> map) {

        return map.entrySet().stream().map(x -> {
            Student student = new Student();
            student.setId(x.getKey());
            student.setName(x.getValue());
            return student;
        }).collect(Collectors.toList());

/*
        for (Map.Entry entry : map.entrySet()
        ) {
           // Student student = new Student();
            Integer id = (Integer) entry.getKey();
            String name = (String) entry.getValue();
            student.setId(id);
            student.setName(name);
            students.add(student);
        }
        return students;

 */
    }

}
