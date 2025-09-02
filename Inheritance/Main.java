package Inheritance;

// INHERITANCE = Child class inherits the attributes and methods from Parent class.
// The keywork 'extend' is used for inheritance.
// child <-- parent <-- grandParent
// Java supports Single, Multilevel, Hierarchical.
// We can use Multiple using Interface.

                 //// Organism (grandParent)
                 ////    |
                 ////  Animal  (parent)
                 ////  |    |
                 //// Dog  Cat (child)

class Organism{
    boolean isAlive;
    Organism(){
        isAlive = true;
    }
}

class Animal extends Organism {
    void eat(){
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal{
    int lives = 1;
    void speak(){
        System.out.println("The dog goes **woof**");
    }
}

class Cat extends Animal{
    int lives = 9;
    void speak(){
        System.out.println("The cat goes **meow**");
    }
}

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

    }
}

