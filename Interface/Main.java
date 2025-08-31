package Interface;

// INTERFACE =  blueprint of a class that contains abstract methods by default.
// A class can implement an interface to provide actual behaviour.
// Interface used to achieve "abstraction" and "multiple inheritance(subclass can have multiple parentclasses)".
// The keyword 'interface' is used to create an Interface. And 'implements' is used to extend the interface class.

interface Prey{
    void flee();
}

interface Predator{
    void hunt();
}

class Rabbit implements Prey{
    @Override
    public void flee() {
        System.out.println("The rabbit is running away");
    }
}

class Fish implements Prey, Predator{  // usage of multiple inheritance using interface.

    @Override
    public void flee() {
        System.out.println("The fish is swimming away.");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting.");
    }

}

class Hawk implements Predator{

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting.");
    }
}

public class Main {
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish(); // usage of multiple inheritance using interface.

        rabbit.flee();
        hawk.hunt();
        fish.flee(); // usage of multiple inheritance using interface.
        fish.hunt();
    }
}
