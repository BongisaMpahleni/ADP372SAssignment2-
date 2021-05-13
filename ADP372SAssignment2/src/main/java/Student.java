
public class Student {

    private String FirstName;
    private String LasttName;
    private String PhoneNumber;
    private String Course;

    public Student(String firstName, String lasttName, String phoneNumber, String course) {
        FirstName = firstName;
        LasttName = lasttName;
        PhoneNumber = phoneNumber;
        Course = course;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLasttName() {
        return LasttName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCourse() {
        return Course;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLasttName(String lasttName) {
        LasttName = lasttName;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setCourse(String course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LasttName='" + LasttName + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }
}
