
public class PriorityQueue {

    EmployeeNode<Employee> leastProductiveEmployee;
    EmployeeNode<Employee> mostProductiveEmployee;

    public PriorityQueue() {
        this.leastProductiveEmployee = null;
        this.mostProductiveEmployee = null;
    }

    public void addEmployee(Employee employee) {
        EmployeeNode<Employee> newEmployee = new EmployeeNode<>(employee);

        if(this.leastProductiveEmployee == null){
            this.leastProductiveEmployee = newEmployee;
            this.mostProductiveEmployee = newEmployee;
        }
        else if (this.leastProductiveEmployee.employee.getPerformanceRating() > newEmployee.employee.getPerformanceRating()) {
            newEmployee.nextEmployeeNode = leastProductiveEmployee;
            this.leastProductiveEmployee = newEmployee;
        }
        else {
            EmployeeNode<Employee> currentEmployee = leastProductiveEmployee;
            EmployeeNode<Employee> tempEmployee = leastProductiveEmployee;
            while (currentEmployee != null && currentEmployee.getEmployee().getPerformanceRating() <
                    newEmployee.getEmployee().getPerformanceRating()) {
                if(newEmployee.getEmployee().getPerformanceRating() > currentEmployee.getEmployee().getPerformanceRating()){
                    tempEmployee = currentEmployee;
                    currentEmployee = currentEmployee.nextEmployeeNode;

                }
            }


            tempEmployee.nextEmployeeNode = newEmployee;
            newEmployee.nextEmployeeNode = currentEmployee;


        }

    }


    public void layoffEmployee(){
        this.leastProductiveEmployee = this.leastProductiveEmployee.nextEmployeeNode;
    }

    public Employee peekLeastProductive() {
        return leastProductiveEmployee.getEmployee();
    }

    public Employee peekMostProductive() {
        return mostProductiveEmployee.getEmployee();
    }

    public void massLayoff() {
        this.leastProductiveEmployee = null;
    }
}
