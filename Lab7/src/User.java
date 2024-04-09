public class User {

    private final String firstName;
    private final String lastName;
    private final String iban;

    public User(String firstName, String lastName, String iban) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIban() {
        return iban;
    }

}
