package obj;

import java.util.List;

public class School {
    public School(String name, Phase Level, List<Student> students) {
        this.name = name;
        this.level = Level;
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private String name;

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Phase getLevel() {
        return level;
    }

    private Phase level;
    private List<Student> students;

    enum Phase {
        PRIMARY, SCONDRY,
        UNIVERSITY
    }
}

