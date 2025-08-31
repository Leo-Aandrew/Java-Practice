package Abstraction;

// ABSTRACTION = process of hiding implementation details and showing only the essential features.
// It is used to define abstract classes and methods using "abstract" keyword.
// Abstract classes can't be instantiated directly.
// Can contain 'abstract' methods (which must be implemented).
// ABSTRACT METHOD = method without body (must be overridden in subclass).
// Can contain 'concrete' methods (which are inherited).
// CONCRETE METHOD = method with body (just like normal method).

abstract class Shape{
    abstract double area(); // ABSTRACT METHOD

    void display(){ // CONCRETE METHOD
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args){
//        Shape shape = new Shape();  //This results error because we can't instantiate abstract class.

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());


    }
}
