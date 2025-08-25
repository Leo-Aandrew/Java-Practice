import java.util.Scanner;
import java.util.Random;

public class DiceGame {

    public static void main(String[] args){

        // DICE ROLL GAME:

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int dice;
        int total = 0;

        System.out.print("Enter number of dice to roll: ");
        dice = sc.nextInt();

        for(int i=0; i<dice; i++){
            int roll;
            roll = r.nextInt(1,7);

            printDice(roll);
            total += roll;

        }
        System.out.println("Total = " + total);

    }

    static void printDice(int roll){

        // FOR ● , CLICK WINDOWS+R THEN RUN COMMAND OPEN, TYPE charmap and press enter.

        String dice1 = """
                  -------
                |         |
                |    ●    |
                |         |
                  -------
                     1
                """;

        String dice2 = """
                  -------
                | ●       |
                |         |
                |       ● |
                  -------
                     2
                """;

        String dice3 = """
                  -------
                | ●       |
                |    ●    |
                |       ● |
                  -------
                     3
                """;

        String dice4 = """
                  -------
                | ●     ● |
                |         |
                | ●     ● |
                  -------
                     4
                """;

        String dice5 = """
                  -------
                | ●     ● |
                |    ●    |
                | ●     ● |
                  -------
                     5
                """;

        String dice6 = """
                  -------
                | ●  ●  ● |
                |         |
                | ●  ●  ● |
                  -------
                     6
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid dice roll!");
        }
    }
}
