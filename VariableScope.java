public class VariableScope {
    //Here I practiced on Variable Scope:
    //where variable can be accessed.(Local, Class)

    static int a = 10; //GLOBAL VARIABLE

    public static void main(String[] args){
        int b = 20; // LOCAL VARIABLE
        System.out.println(a);
        System.out.println(b);
        sample();
    }

    static void sample(){
        int a = 30; // LOCAL VARIABLE THAT OVERRIDES GLOBAL VARIABLE
        System.out.println(a);
    }

}
