package Threading;

// Threading = Allows a program to run multiple tasks simultaneously.
//             Helps improve performance with time-consuming operations.
//             (File I/O, network communications, or any background tasks).

// Two ways to create a Thread:-
// Option 1 = Extend the Thread class (simpler)
// Option 2 = Implement the Runnable Interface (better)

import java.util.Scanner;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if(i == 5){
                System.out.println("Time's Up!");
                System.exit(0);
            }
        }
    }

}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // make the thread executing in the background to finish when the Main thread is finished.
        thread.start();

        System.out.println("You have 5 seconds to enter your name");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}
