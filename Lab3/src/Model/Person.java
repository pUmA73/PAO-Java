package Model;

public class Person {
    private String name;

    private String phoneNumber;

    private String emailAddress;

    public Person() {

    }

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n\tPhone Number: " + phoneNumber + "\n\tEmail Address: " + emailAddress + "\n";
    }
}
