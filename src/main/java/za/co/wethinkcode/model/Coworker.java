package za.co.wethinkcode.model;

public abstract class Coworker extends HubUser {

    // TODO: declare private fields
    private final String coworkerId;
    private boolean isActive;

    // TODO: implement constructor (call super())
    public Coworker(String firstName, String lastName, String email,
                    String coworkerId) {
        super(firstName, lastName, email);
        this.coworkerId = coworkerId;
        isActive = true;
    }

    // TODO: implement getter for coworkerId
    public String getCoworkerId() {
        return coworkerId;
    }


    // TODO: implement getter and setter for active
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }

    // TODO: override toString()
    @Override
    public String toString() {
        return super.toString()
                + ", coworkerId=" + coworkerId
                + ", isActive=" + isActive;
    }

    // TODO: declare monthlyRate()
    public abstract double monthlyRate();

    // TODO: declare deskType()
    public abstract String deskType();


    // TODO: declare role()
    public String role() {
        return "Coworker";
    }
}
