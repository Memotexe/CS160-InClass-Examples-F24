public class Student {
    private String firstName;
    private String lastName;
    private double GPA;
    
    public Student(String firstName, String lastName, double gPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        GPA = gPA;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", GPA=" + GPA + "]";
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }

    

}
