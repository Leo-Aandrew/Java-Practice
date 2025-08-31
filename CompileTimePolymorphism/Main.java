package CompileTimePolymorphism;

// COMPILE-TIME POLYMORPHISM = also called Method Overloading.
// Multiple methods in the same class can have:
// same name but different parameter lists (with different types).

class Calculation{
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args){
        Calculation calc = new Calculation();

        System.out.println(calc.add(5,5));
        System.out.println(calc.add(4.5,5.5));
        System.out.println(calc.add(4,3,3));
    }
}
