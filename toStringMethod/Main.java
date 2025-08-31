package toStringMethod;

// toString() = used to return a string representation of an object.
// method inherited from Object Class.
// by default, it returns a hash code as unique identifier.
// it can be "@Override" to provide meaningful details.

class Car{
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    // It overrides the original toString() methods in object class.
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}

public class Main {
    public static void main(String[] args){
        Car car = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car); // Here it normally runs [ car.toString() ] by default which results in hashcode.
                                 // To overcome this we use overriding using the toString() method for meaning output.
                                 // syntax: void String toString() {} --> it overrides the original toString() methods in object class.
    }
}
