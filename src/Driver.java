
public class Driver {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        Employee emp1 = new Employee("Edward", "Lale", 99);
        Employee emp2 = new Employee("Fred", "Thompson", 60);
        Employee emp3 = new Employee("Shawn", "Camoron", 12);
        Employee emp4 = new Employee("Rick", "Simpson", 88);

        pq.addEmployee(emp1);
        pq.addEmployee(emp2);
        pq.addEmployee(emp3);
        pq.addEmployee(emp4);

        System.out.println("Employee Queue after adding the new employees: ");
        printPriorityQueue(pq);



        pq.layoffEmployee();

        System.out.println("After Layoff of least productive employee: ");
        printPriorityQueue(pq);

        System.out.println("Who is the least productive: ");
        System.out.println(pq.peekLeastProductive().toString());

        System.out.println("Who is the most productive: ");
        System.out.println(pq.peekMostProductive().toString());

        System.out.println("Layoff the whole company!!!!!");
        pq.massLayoff();

        printPriorityQueue(pq);


     }

    private static void printPriorityQueue(PriorityQueue pq) {

        EmployeeNode<Employee> temp = pq.leastProductiveEmployee;
        if(temp == null)
            System.out.println("\nThere are no employees!");
        else{
            while (temp != null){
                System.out.println(temp.getEmployee().toString() + "\n");
                temp = temp.nextEmployeeNode;

            }
        }

    }


}
