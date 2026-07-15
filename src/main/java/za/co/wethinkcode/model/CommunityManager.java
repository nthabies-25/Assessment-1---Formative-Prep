package za.co.wethinkcode.model;

public class CommunityManager extends Employee {

    public static final double HOURLY_RATE = 150.00;

    // TODO: implement constructor
    public CommunityManager(String firstName, String lastName, String email,
                            String employeeId, int hoursWorked) {
        super(firstName, lastName, email, employeeId, hoursWorked);
    }

    // TODO: override calculatePay()
    @Override
    public double calculatePay(){
        return getHoursWorked() + HOURLY_RATE;
    };

    // TODO: override role()
    @Override
    public String role() {
        return "Community Manager";
    }

    // TODO: override toString()
    @Override
    public String toString() {
        return super.toString()
                + ", role=" + role()
                + calculatePay();

    }

}
