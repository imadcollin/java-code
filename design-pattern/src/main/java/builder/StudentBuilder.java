package builder;

public class StudentBuilder {
    private String first_name;
    private String last_name;
    private int age;
    private int id;

    public StudentBuilder(String first_name, String last_name, int age, int id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.id = id;
    }

    public StudentBuilder SetFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public StudentBuilder SetLast_name(String last_name) {
        this.last_name = last_name;
        return this;

    }

    public StudentBuilder SetAge(int age) {
        this.age = age;
        return this;

    }

    public StudentBuilder SetId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder build() {
        return new StudentBuilder(first_name, last_name, age, id);
    }

    StudentBuilder() {

    }

    @Override
    public String toString() {
        return "name: " + first_name + " " + last_name + "\t age:" + age;
    }
}
