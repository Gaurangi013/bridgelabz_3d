package Practice.oops.Polymorphism;

public class MathUtils {

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b , int c) {
        return a +b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(10.5, 20.5));
        System.out.println(add(10, 20, 30));
    }

    }
    

