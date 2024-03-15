package Model;

public class Professor extends Person {

    private String course;

    private int year;

    public Professor() {
    }

    public Professor(String name, String phoneNumber, String emailAddress,
                     String course, int year) {
        super(name, phoneNumber, emailAddress);

        this.course = course;
        this.year = year;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getCourse()
    {
        return course;
    }

    public int getYear()
    {
        return year;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n\tPhone Number: " + getPhoneNumber() + "\n\tEmail Address: " + getEmailAddress()
                 + "\n\tCourse: " + course + "\n\tYear: " + year + "\n";
    }
}
