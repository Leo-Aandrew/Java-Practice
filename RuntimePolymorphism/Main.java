package RuntimePolymorphism;

// RUNTIME POLYMORPHISM = Also called Method Overriding.
// Subclass overrides the method that is already defined in the parent class.
// The method name, parameter, and return type must be same.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound(); // Dog barks
        cat.sound(); // Cat meows
    }
}

