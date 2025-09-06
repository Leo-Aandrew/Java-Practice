package Composition;

// COMPOSITION = "Has-A" relationship (strong)
// where one class contains a reference to another class, but (it dependent on each other).
// here if we remove the car class then the engine class won't run because they dependent on each other).

class Engine{
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("The " + this.type + " is started");
    }

}

class Car{
    String model;
    int year;
    Engine engine;

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + model + " is running");
    }

}

public class Main {
    public static void main(String[] args){
        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }

}
