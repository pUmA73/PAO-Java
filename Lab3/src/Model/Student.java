package Model;

public class Student extends Person {

    private int studentNumber;

    private float averageMark;

    private int cclass;

    public Student() {
    }

    public Student(String name, String phoneNumber, String emailAddress, int studentNumber,
                   float averageMark, int cclass) {
        super(name, phoneNumber, emailAddress);

        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.cclass = cclass;
    }

    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public void setAverageMark(float averageMark)
    {
        this.averageMark = averageMark;
    }

    public void setCclass(int cclass)
    {
        this.cclass = cclass;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public float getAverageMark()
    {
        return averageMark;
    }

    public int getCclass()
    {
        return cclass;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n\tPhone Number: " + getPhoneNumber() + "\n\tEmail Address: " + getEmailAddress()
                + "\n\tStudent Number: " + studentNumber + "\n\tAverage Mark: " + averageMark + "\n\tClass: " + cclass + "\n";
    }
}
