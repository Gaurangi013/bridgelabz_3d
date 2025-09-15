class Student {
    private int StudentRollNumber;
    private String StudentName;
    private int StudentAge;
    private String StudentDepartment;

    //StudentRollNumber
    public int getStudentRollNumber() {
        return StudentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.StudentRollNumber = studentRollNumber;
    }

    //StudentName
    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    //StudentAge
    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        this.StudentAge = studentAge;
    }

    //StudentDepartment
    public String getStudentDepartment() {
        return StudentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.StudentDepartment = studentDepartment;
    }
    @Override
    public String toString() {
        return "Roll Number: " + StudentRollNumber + ", Name: " + StudentName + ", Age: " + StudentAge + ", Department: " + StudentDepartment;
    }
}