public class Varargs {

    // Varargs allow a method to take a variable number of arguments.
    // No need for overloaded methods.
    // Java will pack the arguments into array.
    // (int... array) --> ... (ellipsis)

    public static void main(String[] args){

        System.out.println(add(1,2,3,4,5)); // count numbers in array
        System.out.println(add(1,2,3));
        System.out.println(add(1,2));

        display("apple","orange","grapes"); // display array values
        display("banana","pineapple");

    }

    // count numbers in array
    static int add(int... numbers){
        int count = 0;

        for(int num : numbers){
            count+=num;
        }

        return count;
    }

    // display array values
    static void display(String... fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }


}


/*  NORMAL OVERLOADED METHODS WITH VARARGS :

public class VarargsNormal {

    public static void main(String[] args){

        // Using overloaded methods instead of varargs
        System.out.println(add(1,2,3,4,5));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2));

        display("apple","orange","grapes");
        display("banana","pineapple");

    }

    // Overloaded methods for add
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    // Overloaded methods for display
    static void display(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void display(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
 */
