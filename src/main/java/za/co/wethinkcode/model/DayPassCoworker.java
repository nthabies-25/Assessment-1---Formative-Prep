package za.co.wethinkcode.model;

public class DayPassCoworker extends Coworker {

    public static final double DAILY_RATE = 250.00;

    // TODO: implement constructor
    public DayPassCoworker(String firstName, String lastName, String email,
                           String coworkerId) {
        super(firstName, lastName, email, coworkerId);

    }

    // TODO: override monthlyRate()
    @Override
    public double monthlyRate(){
        return DAILY_RATE;
    }

    // TODO: override deskType()
    @Override
    public String deskType(){
        return "Hot Desk in Open Area";
    }

    // TODO: override role()
    @Override
    public String role() {
        return "Day Pass User";
    }

    // TODO: override toString()
    @Override
    public String toString() {
        return super.toString()
                + ", role=" + role()
                + ", deskType=" + deskType()
                + ", monthlyRate=" + monthlyRate();
    }
}
