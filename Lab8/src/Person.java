import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private int age;
    private double amount;
    private String currency;

    public Person(String firstName, String lastName, int age, double amount, String currency) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.amount = amount;
        this.currency = currency;
    }

    // Setteri
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Getteri

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return firstName + "; " + lastName + "; " + age + "; " + amount + "; " + currency + "; \n";
    }

}
