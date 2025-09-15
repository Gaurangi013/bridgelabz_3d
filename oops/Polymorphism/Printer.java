package Practice.oops.Polymorphism;

public class Printer {
    public Printer(String message, int number){
        System.out.println("message: " + message);
        System.out.println("number: " + number);
    }
    public static class Colorprinter extends Printer{
        public Colorprinter() {
            super(message, number);
            //TODO Auto-generated constructor stub
        }

        public void print(String message){
            System.out.println("in color: " + message);
        }
    }
    public static void main(String[] args){
        Printer p = new Printer(null, 0);
        ((Printer) p).Printer("Hello",5);
        Colorprinter cp = new Colorprinter();
        cp.print("Hello in color");
    }
    private Printer(String string, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Printer'");
    }
}
