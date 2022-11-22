package interpreter;

public abstract class Employee {
    protected long employeeId;
    protected String employeeName;

    public Employee(long employeeId, String employeeName, String designation, Department department, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    protected String designation;
    protected Department department;
    protected int salary;

    public abstract int teamSize();

    public abstract String teamNames();

    public abstract boolean isManager();

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee Name: % - Salary: %d  - dESIGNATION: &S ", employeeName, salary, designation);
    }
}
