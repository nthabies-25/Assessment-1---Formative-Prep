package za.co.wethinkcode.model;

public class ResidentCoworker extends Coworker {

    public static final double MONTHLY_RATE = 3500.00;

    // TODO: declare private field(s)
    private final String deskNumber;

    // TODO: implement constructor
    public ResidentCoworker(String firstName, String lastName, String email,
                            String coworkerId, String deskNumber) {
        super(firstName, lastName, email, coworkerId);
        this.deskNumber = deskNumber;


    }

    // TODO: implement getter for deskNumber
    public String getDeskNumber() {
        return deskNumber;
    }

    // TODO: override monthlyRate()

    @Override
    public double monthlyRate(){
        return MONTHLY_RATE;
    }

    // TODO: override deskType()
    @Override
    public String deskType(){
        return "Dedicated Desk";
    }

    // TODO: override role()
    @Override
    public String role() {
        return "Resident";
    }

    // TODO: override toString()
    @Override
    public String toString() {
        return super.toString()
                + ", role=" + role()
                + ", deskType=" + deskType()
                + ", monthlyRate=" + monthlyRate()
                + ", deskNumber=" + deskNumber;
    }
}
