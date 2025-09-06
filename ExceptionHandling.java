import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

// EXCEPTION = An event that interrupts the normal flow of a program.
//             (Divide by zero, file not found, mismatch input type)
//             Surround any dangerous code with a try{} block.
//             try{}, catch{}, finally{}

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (Exception e) {
            // this is something used for safety purpose when we don't know the exact exception.
            System.out.println("Something went wrong!" + e);
        } finally {
            System.out.println("This always execute...");
        }
    }

}
