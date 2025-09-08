public class parent {
    parent(){
        System.out.println("parent class constructor");
    }
    parent(int a){
        this();
        System.out.println("parent class parameterized constructor"+a);

    }   
    }

