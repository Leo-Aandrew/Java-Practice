public class LoopStatements {
    public static void main(String[] args){
// HERE I PRACTICED ON :
/*
       WHILE LOOP, DO WHILE LOOP, FOR LOOP, THREAD.SLEEP(1000), BREAK , CONTINUE,
       NESTED LOOP (USED FOR MATRIX AND DSA)
*/
//---------------------------------------------------------------------------------------------------------------------
// MATRIX PROBLEM: (ROW & COL)
//        Scanner sc = new Scanner(System.in);
//        int rows;
//        int cols;
//        char symbol;
//
//        System.out.print("Enter number of rows: ");
//        rows = sc.nextInt();
//
//        System.out.print("Enter number of columns: ");
//        cols = sc.nextInt();
//
//        System.out.print("Enter the symbol to use: ");
//        symbol = sc.next().charAt(0);
//
//        for(int i=1; i<=rows; i++){
//            for(int j=1; j<=cols; j++){
//                System.out.print(symbol + " ");
//            }
//            System.out.println();
//        }
//
//        sc.close();
//---------------------------------------------------------------------------------------------------------------------
// NESTED LOOP : (used often with matrices and DSA)
//        for(int i=1; i<=3; i++){
//            for(int j=1; j<=10; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//       /* THIS CODE OUTPUT THE SAME AS THE ABOVE CODE
//        for(int i=1; i<=10; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for(int i=1; i<=10; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for(int i=1; i<=10; i++){
//            System.out.print(i + " ");
//        }
//        */
//---------------------------------------------------------------------------------------------------------------------
// BREAK (stop loop) & CONTINUE (skip current iteration) :
//        for(int i=0; i<=10; i++){
//            if(i == 5){
//                break;
//            }
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\n");
//
//        for(int i=0; i<=10; i++){
//            if(i == 5){
//                continue;
//            }
//            System.out.print(i + " ");
//        }
//---------------------------------------------------------------------------------------------------------------------
// COUNTDOWN PROBLEM WITH DELAY 1S: (Thread.sleep(1000))
//        public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter how many seconds to countdown from?: ");
//        int start = sc.nextInt();
//
//        for(int i = start; i > 0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("Happy New Year!!!");
//        }
//---------------------------------------------------------------------------------------------------------------------
// FOR LOOP : (executes some code a certain amount of time)
//
//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
//       }
//
//        for(int i = 10; i >=0; i--){
//            System.out.println(i);
//        }
//
//        for(int i=0; i <= 10; i+=2){
//            System.out.println(i);
//        }
//---------------------------------------------------------------------------------------------------------------------
// NUMBER GUESSING GAME:
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//
//        int guess;
//        int attempts = 0;
//        int randomNumber = random.nextInt(1,6);
//
//        System.out.println("Number guessing game: ");
//        System.out.println("Guess a number b/w 1-5");
//
//        do{
//            System.out.print("Enter a guess: ");
//            guess = sc.nextInt();
//            attempts++;
//
//            if(guess < randomNumber){
//                System.out.println("Too Low");
//            }
//            else if(guess > randomNumber){
//                System.out.println("Too High");
//            }
//            else{
//                System.out.println("The correct number is " + randomNumber);
//                System.out.println("Number of attempts: " + attempts);
//            }
//        }while(guess != randomNumber);
//
//        System.out.println("You have won the game");
//
//        sc.close();
//----------------------------------------------------------------------------------------------------------------------
// DO WHILE LOOP:
//        Scanner sc = new Scanner(System.in);
//
//        int num;
//
//        do{
//            System.out.print("Enter the number b/w 1 to 10: ");
//            num = sc.nextInt();
//        }while(num < 1 || num > 10);
//
//        System.out.println(num);
//
//        sc.close();
//----------------------------------------------------------------------------------------------------------------------
// WHILE LOOP: (executes some code until some condition is true)
//        Scanner sc = new Scanner(System.in);
//
//        int num = 0;
//
//        while(num < 1 || num > 10) {
//            System.out.print("Enter the number b/w 1 to 10: ");
//            num = sc.nextInt();
//        }
//
//        System.out.println(num);
//
//        sc.close();
    }
}
