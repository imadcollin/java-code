package interpreter;

public class Engineer extends Employee {
    public Engineer(long employeeId, String employeeName, String designation, Department department, int salary) {
        super(employeeId, employeeName, designation, department, salary);
    }

    @Override
    public int teamSize() {
        return 1;
    }

    @Override
    public String teamNames() {
        return "Engineers";
    }

    @Override
    public boolean isManager() {
        return false;
    }
}
