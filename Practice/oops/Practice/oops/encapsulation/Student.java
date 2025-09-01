package Practice.oops.encapsulation;

// Class names in Java should start with an uppercase letter and match the filename
public class Student {
    private int studentRollNumber;
    private String studentName;
    private int studentAge;
    private String studentDepartment;

    // StudentRollNumber
    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    // StudentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // StudentAge
    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    // StudentDepartment
    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    @Override
    public String toString() {
        return "Roll Number: " + studentRollNumber + ", Name: " + studentName + ", Age: " + studentAge + ", Department: " + studentDepartment;
    }
}

