package za.co.wethinkcode.model;

public abstract class Employee extends HubUser {

    // TODO: declare private fields
    private String employeeId;
    private int hoursWorked;


    // TODO: implement constructor (call super())
    public Employee(String firstName, String lastName, String email,
                    String employeeId, int hoursWorked) {
        super(firstName, lastName, email);
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
    }

    // TODO: implement getter for employeeId (no setter)
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // TODO: implement getter and setter for hoursWorked
    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // TODO: override toString()
    @Override
    public String toString() {
        return super.toString()
                + ", role=" + role()
                + ", employeeId=" + getEmployeeId()
                + ", hoursWorked=" + getHoursWorked();

    }

    // TODO: declare calculatePay()
    public abstract double calculatePay();


    // TODO: declare role()
    @Override
    public String role() {
        return "Employee";
    }
}
