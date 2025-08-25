public class Methods {
    //Here I practiced on methods (block of reusable code that is executed when called ()):
    /*
     NO RETURN TYPE, RETURN TYPE, WITH PARAMETERS, WITHOUT PARAMETERS, OVERLOADED METHODS,
     STATIC METHODS (used for not creating an object for that class to access those methods),
     NON-STATIC METHODS (methods that share same name but different parameters)
     */
    public static void main(String[] args){

//        message1();
//        message2("leo",21);
//
//        double result = square(3);
//        System.out.println(result);
//
//        String name = fullName("Leo","Aandrew");
//        System.out.println(name);
//
//        int age = 21;
//        if(validAge(age)){
//            System.out.println("You are able to vote!");
//        }
//        else{
//            System.out.println("You can't able to vote!");
//        }

        //OVERLOADED METHODS:
        // (methods that share same name but different parameters)
        System.out.println("Method add with 2 parameters: " + add(2,3));
        System.out.println("Method add with 3 parameters: " + add(2,3,4));

        //NON-STATIC METHODS
        //(non-static methods needs an object to call those methods)
        Methods m = new Methods();
        m.message();
    }



//    static void message1(){
//        System.out.println("hello");
//    }
//
//    static void message2(String name, int age){
//        System.out.printf("My name is %s and I am %d years old.\n", name, age);
//    }
//
//    static double square(double num){
//        return num*num;
//    }
//
//    static String fullName(String first, String last){
//        return first +" "+ last;
//    }
//
//    static boolean validAge(int age){
//        if(age > 18){
//            return true;
//        }
//        else{
//            return false;
//        }
//        // SHORTER VERSION OF THE ABOVE STATEMENT:  return age > 18;
//    }

    //OVERLOADED METHODS:
    static double add(double a, double b){
        return  a + b;
    }

    //OVERLOADED METHODS:
    static double add(double a, double b, double c){
        return a + b + c;
    }

    //NON-STATIC METHOD:
    void message(){
        System.out.println("This is a non-static method.");
    }
}
