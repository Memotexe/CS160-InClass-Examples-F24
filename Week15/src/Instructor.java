public class Instructor {

    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    public Instructor(Instructor instructor) {
        this.firstName = instructor.getFirstName();
        this.lastName = instructor.getLastName();
        this.officeNumber = instructor.getOfficeNumber();
    }

    @Override
    public String toString() {
        return "Instructor [lastName=" + lastName + ", firstName=" + firstName + ", officeNumber=" + officeNumber + "]";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((officeNumber == null) ? 0 : officeNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Instructor other = (Instructor) obj;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (officeNumber == null) {
            if (other.officeNumber != null)
                return false;
        } else if (!officeNumber.equals(other.officeNumber))
            return false;
        return true;
    }

}
