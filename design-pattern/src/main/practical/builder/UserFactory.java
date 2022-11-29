package builder;

public class UserFactory {
    private String name;
    private int age;
    private double salary;
    private Department department;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }


    public UserFactory SetName(String name) {
        this.name = name;
        return this;
    }

    public UserFactory SetAge(int age) {
        this.age = age;
        return this;
    }

    public UserFactory SetSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public UserFactory SetDepartment(Department department) {
        this.department = department;
        return this;
    }

    public User builder(String name, int age, double salary, Department department) {
        User user = new User(name, age, salary, department);
        return user;
    }
}
