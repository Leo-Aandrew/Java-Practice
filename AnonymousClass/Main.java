package AnonymousClass;

// ANONYMOUS CLASS = A class that doesn't have a name. Cannot be reused.
//                   Add a custom behavior without having to create a new class.
//                   Often used for one time uses (TimerTask, Runnable, callbacks).


// USING INTERFACE:-
interface Dog{
    void speak();
}

// USING NORMAL CLASS:-
//class Dog{
//    void speak(){
//        System.out.println("The dog goes woof");
//    }
//}

public class Main {
    public static void main(String[] args){

        // USING INTERFACE:-
        Dog dog = new Dog(){
            @Override
            public void speak(){
                System.out.println("The dog goes woof");
            }
        };
        dog.speak();


// USING NORMAL CLASS:-
//            Dog dog1 = new Dog();
//            Dog dog2 = new Dog(){
//                @Override
//                void speak(){
//                    System.out.println("Scooby Doo says *Ruh Roh*");
//                }
//            };
//            dog1.speak();
//            dog2.speak();

    }

}
