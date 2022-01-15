public class EmployeeNode<Employee> {
    Employee employee;
    EmployeeNode<Employee> nextEmployeeNode;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
        this.nextEmployeeNode = null;
    }

    public Employee getEmployee() {
        return employee;
    }
}



