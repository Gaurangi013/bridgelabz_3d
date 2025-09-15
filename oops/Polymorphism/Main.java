package Practice.oops.Polymorphism;

// Parent class
class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

// Child class Cat
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal d = new Dog(); // parent ref → child object
        Animal c = new Cat();

        d.speak(); // Outputs: Dog barks
        c.speak(); // Outputs: Cat meows
    }
}



    

    

