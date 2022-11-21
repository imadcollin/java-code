package protoype;

public class Employee implements IEmployee {
    private String name, address;
    private double salary;

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public IEmployee getGlone() {
        return new Employee(name, address, salary);
    }

    public void printRecord() {
        System.out.printf("name is: %s \t salary: %s \n", name, salary);
    }
}
