import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter distance in feet: ");
            double distanceFeet = sc.nextDouble();
            double yards = distanceFeet / 3;
            double miles = yards / 1760;
            System.out.println("The distance is " + distanceFeet + " feet which is " + yards + " yards and " + miles + " miles");
        }
    }
}

