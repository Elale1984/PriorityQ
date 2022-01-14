public class EmployeeNode<Employee> {
    Employee employee;
    EmployeeNode<Employee> nextEmployeeNode;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
        this.nextEmployeeNode = null;
    }

    public EmployeeNode(){
        this.employee = null;
        this.nextEmployeeNode = null;
    }
}
