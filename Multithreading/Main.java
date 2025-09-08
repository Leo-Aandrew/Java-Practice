package Multithreading;

// Multithreading = Enables a program to run multiple threads concurrently.
//                  (Thread = A set of instructions that run independently).
//                  Useful for background tasks or time-consuming operations.


class myRunnable implements Runnable{

    private final String text;

    myRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName() + " " + i);  // To get the current name of the thread that is running we use [Thread.currentThread().getName()].
                System.out.println(text);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        myRunnable myRunnable = new myRunnable(); // Instead of creating a myRunnable opject like this we can use the Anonymous object.(i.e, new myRunnable()).
        Thread thread1 = new Thread(new myRunnable("PING"));
        Thread thread2 = new Thread(new myRunnable("PONG"));

        System.out.println("Game Start!");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted");
        }


        System.out.println("Game Over!");
    }
}
