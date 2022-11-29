package builder;


public class User {
    private String name;
    private int age;
    private double salary;
    private Department department;

    public User(String name, int age, double salary, Department department) {
        this.name = name;
        this.age=age;
        this.department=department;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

enum Department {
    HR, IT, COMMINUCATION, ECONOMY;
}