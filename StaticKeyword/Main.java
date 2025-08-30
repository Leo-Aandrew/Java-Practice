package StaticKeyword;
// STATIC = make the variable or method belongs to the class rather than object.
// No need to create object.
// Commonly used for utility methods (example like: Math.round(10.3)) or shared resources.

class Friend{
    static int numOfFriends;
    String name;


    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends.");
    }
}

public class Main {
   public static void main(String[] args) {

       Friend friend1 = new Friend("zoro");
       Friend friend2 = new Friend("zoro");
       Friend friend3 = new Friend("zoro");
       Friend friend4 = new Friend("zoro");

       Friend.showFriends(); //output: 4 because of static
   }
}
