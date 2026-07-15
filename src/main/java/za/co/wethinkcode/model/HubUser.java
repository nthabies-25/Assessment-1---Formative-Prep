package za.co.wethinkcode.model;

public abstract class HubUser {

    // TODO: declare private fields
    private final String firstName;
    private final String lastName;
    private String email;


    // TODO: implement constructor
    public HubUser(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    // TODO: implement getters (no setters for firstName / lastName)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    // TODO: implement setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // TODO: implement fullName()
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // TODO: override toString()
    @Override
    public String toString() {
        return getFullName();
    }

    // TODO: declare getRole()
    public abstract String role();

}
