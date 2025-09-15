package Practice.oops.Polymorphism_Question;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.area();      // Outputs: Area of Circle: 78.5
        rectangle.area();   // Outputs: Area of Rectangle: 24
    }
}
