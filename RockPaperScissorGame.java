import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] choices = {"rock","paper","scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        do{
            System.out.print("Enter the choice (rock, paper, scissor): ");
            playerChoice = sc.nextLine().toLowerCase();

            computerChoice = choices[r.nextInt(0,3)];
            System.out.println("Computer choice is: " + computerChoice);

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")){
                System.out.println("Invalid choice");
                continue;
            }

            if(playerChoice.equals(computerChoice)){
                System.out.println("Its tie");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissor"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissor") && computerChoice.equals("paper"))){
                System.out.println("You Win");
            }
            else{
                System.out.println("You Lose");
            }

            System.out.print("PlayAgain (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!!!");

        sc.close();
    }
}
