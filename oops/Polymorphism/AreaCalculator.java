package Practice.oops.Polymorphism;

public class AreaCalculator {
    public static  int area(int side) {
        return  side * side;
    }

    public static int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Area of Circle: " + area(7));
        System.out.println("Area of Rectangle: " + area(10, 20));
    }
    
}
