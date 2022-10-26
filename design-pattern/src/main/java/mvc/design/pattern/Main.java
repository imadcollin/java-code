package mvc.design.pattern;

public class Main {
    public static void main(String[] args) {
        Employee employee = getEmployy();
        EmployeeModel model = new EmployeeModel();
        EmployeeCtrl ctrl = new EmployeeCtrl(employee, model);
        ctrl.updateView();

        employee.setSalary(700);

        ctrl.updateView();
    }

    private static Employee getEmployy() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Emp1");
        employee.setSalary(500);
        return employee;
    }

}
