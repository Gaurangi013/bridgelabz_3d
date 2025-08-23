import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int numberOfStudents = sc.nextInt();
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("The maximum number of handshakes is " + handshakes);
        }
    }
}

