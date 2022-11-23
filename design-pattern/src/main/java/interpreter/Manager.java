package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager extends Employee {
    private List<Employee> employees;

    public Manager(long employeeId, String employeeName, String designation, Department department, int salary) {
        super(employeeId, employeeName, designation, department, salary);
        employees = new ArrayList<>();
    }

    @Override
    public int teamSize() {
        return employees.size();
    }

    @Override
    public String teamNames() {
        String names = "";
        if (!employees.isEmpty()) {
            names = employees.stream().map(employee -> employee.getEmployeeName()).collect(Collectors.joining(","));
        }
        return names;
    }

    @Override
    public boolean isManager() {
        return true;
    }
}
