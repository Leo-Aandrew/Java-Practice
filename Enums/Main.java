package Enums;
//Enums = (Enumerations) a special kind of class that represents fixed set of constants.
//        They improve code readability and are easy to maintain.
//        More efficient with switches when comparing Strings.


import java.util.Scanner;

enum Day{
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }

}

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");

                case SATURDAY,
                     SUNDAY -> System.out.println("It is the weekend");

            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!");
        }

        sc.close();
    }
}
