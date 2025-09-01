
package Practice.oops.encapsulation;

// Define the Student class if not already defined elsewhere
class Student {
    private int studentRollNumber;
    private String studentName;
    private int studentAge;
    private String studentDepartment;

    public void setStudentRollNumber(int rollNumber) {
        this.studentRollNumber = rollNumber;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setStudentAge(int age) {
        this.studentAge = age;
    }

    public void setStudentDepartment(String department) {
        this.studentDepartment = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNumber=" + studentRollNumber +
                ", Name='" + studentName + '\'' +
                ", Age=" + studentAge +
                ", Department='" + studentDepartment + '\'' +
                '}';
    }
}

class StudentService {
    private Student studentOne;
    private Student studentTwo;
    private Student studentThree;
    private Student studentFour;
    private Student studentFive;
    private Student studentSix;
    private Student studentSeven;
    private Student studentEight;
    private Student studentNine;
    private Student studentTen;


    public void setStudentDetails(){
    studentOne = new Student();
    studentOne.setStudentRollNumber(101);
    studentOne.setStudentName("Aayush");
    studentOne.setStudentAge(20);
    studentOne.setStudentDepartment("CSE");

    studentTwo = new Student();
    studentTwo.setStudentRollNumber(102);
    studentTwo.setStudentName("Abhinav");
    studentTwo.setStudentAge(20);
    studentTwo.setStudentDepartment("CSE");

    studentThree = new Student();
    studentThree.setStudentRollNumber(103);
    studentThree.setStudentName("Rohan");
    studentThree.setStudentAge(21);
    studentThree.setStudentDepartment("CSE");

    studentFour = new Student();
    studentFour.setStudentRollNumber(104);
    studentFour.setStudentName("Aditi");
    studentFour.setStudentAge(22);
    studentFour.setStudentDepartment("CSE");

    studentFive = new Student();
    studentFive.setStudentRollNumber(105);
    studentFive.setStudentName("Sneha");
    studentFive.setStudentAge(23);
    studentFive.setStudentDepartment("CSE");

    studentSix = new Student();
    studentSix.setStudentRollNumber(106);
    studentSix.setStudentName("Rahul");
    studentSix.setStudentAge(24);
    studentSix.setStudentDepartment("CSE");

    studentSeven = new Student();
    studentSeven.setStudentRollNumber(107);
    studentSeven.setStudentName("Priya");
    studentSeven.setStudentAge(25);
    studentSeven.setStudentDepartment("CSE");

    studentEight = new Student();
    studentEight.setStudentRollNumber(108);
    studentEight.setStudentName("Anjali");
    studentEight.setStudentAge(26);
    studentEight.setStudentDepartment("CSE");

    studentNine = new Student();
    studentNine.setStudentRollNumber(109);
    studentNine.setStudentName("Karan");
    studentNine.setStudentAge(27);
    studentNine.setStudentDepartment("CSE");

    studentTen = new Student();
    studentTen.setStudentRollNumber(110);
    studentTen.setStudentName("Neha");
    studentTen.setStudentAge(28);
    studentTen.setStudentDepartment("CSE");

    }
    public void displayStudentDetails(){

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);
        System.out.println(studentFour);
        System.out.println(studentFive);
        System.out.println(studentSix);
        System.out.println(studentSeven);
        System.out.println(studentEight);
        System.out.println(studentNine);
        System.out.println(studentTen);

    }
}
