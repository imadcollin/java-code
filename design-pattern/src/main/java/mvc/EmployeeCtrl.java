package mvc;

public class EmployeeCtrl {
    private Employee employee;
    private EmployeeModel model;

    public EmployeeCtrl(Employee employee, EmployeeModel model) {
        this.employee = employee;
        this.model = model;
    }

    private String getEmployyName() {
        return employee.getName();
    }

    private int getEmployeeAId() {
        return employee.getId();
    }

    private double getEmpSalary() {
        return employee.getSalary();
    }

    public void updateView() {
        model.print(getEmployyName(), getEmployeeAId(), getEmpSalary());
    }
}
