package Polymorphism;

// POLYMORPHISM = means "many forms"
// same method can behave differently based on some situations.
// Two types of polymorphism :
// --> Runtime Polymorphism(Method Overriding)
// --> CompileTime Polymorphism(Method Overloading)

// Here this eg is based on runtime polymorphism(method overriding).

abstract class Vehicle{
    abstract void go();
}

class Car extends Vehicle{
    @Override
    void go() {
        System.out.println("You drive the car");
    }
}

class Bike extends Vehicle{
    @Override
    void go(){
        System.out.println("You ride the bike");
    }
}

class Boat extends Vehicle{
    @Override
    void go(){
        System.out.println("You sail the boat");
    }
}

public class Main {
    public static void main(String[] args){

        Vehicle car = new Car(); // Polymorphic reference
        Vehicle bike = new Bike();
        Vehicle boat = new Boat();

        car.go();
        bike.go();
        boat.go();

// This below code also output the same as the above code definition.
//        Car car = new Car();
//        Bike bike = new Bike();
//        Boat boat = new Boat();
//
//        Vehicle[] vehicles = {car, bike, boat};
//
//        for(Vehicle v : vehicles){
//            v.go();
//        }
    }
}
