package Practice.oops.Abstraction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101);
        Teacher teacher = new Teacher("Mathematics");

        student.displayInfo(); // Outputs: Roll No: 101
        teacher.displayInfo(); // Outputs: Subject: Mathematics
    }
}
