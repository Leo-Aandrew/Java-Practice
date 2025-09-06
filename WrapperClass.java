public class WrapperClass {

    // WRAPPER CLASS: It is a class that wrap primitive datatype into objects.
    // AUTOBOXING : Automatically converts primitive datatype into wrapper object.
    // UNBOXING : Automatically converts wrapper object into primitive datatype.
    // Allows use of Collections Framework and static utility methods.

    public static void main(String[] args) {
//-------------------------------------------------------------------------------------------------
// AUTOBOXING:
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
//
// UNBOXING:
//        int x1 = a;
//        double x2 = b;
//        Character x3 = c;
//        Boolean x4 = d;
//
//        System.out.println(a); // 123 -> wrapper object
//        System.out.println(x1); // 123 -> primitive value
//-------------------------------------------------------------------------------------------------
// TO CONVERT PRIMITIVE DATA TO STRING (ie, int -> String):
//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('$');
//        String d = Boolean.toString(true);
//
//        String x = a + b + c + d;
//
//        System.out.println(x);
//-------------------------------------------------------------------------------------------------
// TO CONVERT STRING TO PRIMITIVE DATA (ie, String -> int):
//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "leo".charAt(0);
//        boolean d = Boolean.parseBoolean("true");
//
//        System.out.println(a);
//-------------------------------------------------------------------------------------------------
// SOME OTHER STATIC UTILITY METHODS:
//        char letter = 'b';
//
//        System.out.println(Character.isLetter(letter)); //true
//        System.out.println(Character.isDigit(letter)); // false
//        System.out.println(Character.isLetterOrDigit(letter)); //true
//        System.out.println(Character.isUpperCase(letter)); //false
//-------------------------------------------------------------------------------------------------
    }
}
