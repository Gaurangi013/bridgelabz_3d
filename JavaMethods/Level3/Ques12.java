import java.util.Scanner;

public class Ques12
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinates of point A (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter coordinates of point B (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between points: " + distance);

        double[] lineEq = lineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", lineEq[0], lineEq[1]);
    }

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m;
        if (x2 - x1 == 0) {
            m = Double.POSITIVE_INFINITY; // Vertical line
        } else {
            m = (y2 - y1) / (x2 - x1); // Slope
        }
        double b = y1 - m * x1; // y-intercept
        return new double[]{m, b};
    }
}
