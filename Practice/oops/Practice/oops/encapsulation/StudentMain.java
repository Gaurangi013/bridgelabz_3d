package Practice.oops.encapsulation;


public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.setStudentDetails();
        studentService.displayStudentDetails();
    }
}
