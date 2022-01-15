public class Employee {
    private final String fName;
    private final String lName;
    private final int performanceRating;

    public Employee(String fName, String lName, int performanceRating) {
        this.fName = fName;
        this.lName = lName;
        this.performanceRating = performanceRating;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    @Override
    public String toString() {
        return  "First Name: " + fName + '\n' +
                "Last Name: " + lName + '\n' +
                "Performance Rating: " + performanceRating + "\n";
    }
}
