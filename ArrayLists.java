import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {

// ARRAYLIST = A resizable array that stores objects (autoboxing).
//             Arrays are fixed in size, but ArrayLists can change.

    public static void main(String[] args){
//--------------------------------------------------------------------------------------------------------
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        list.remove(1);            //["Apple","Banana"]
        list.set(0,"Pineapple");         //[Pineapple, Orange, Banana]
        System.out.println(list.get(1)); //Banana
        System.out.println(list.size()); //3


        Collections.sort(list);
        System.out.println(list);         //[Apple, Banana, Orange]

        for(String l : list){
            System.out.println(l);
        }
//--------------------------------------------------------------------------------------------------------
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list); //[3, 1, 2]
//--------------------------------------------------------------------------------------------------------
//        ArrayList<Double> list = new ArrayList<>();
//
//        list.add(3.14);
//        list.add(1.34);
//        list.add(2.67);
//
//        System.out.println(list); //[3.14, 1.34, 2.67]
//--------------------------------------------------------------------------------------------------------
// Input from User:
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> foods = new ArrayList<>();
//
//        System.out.print("Enter number of food to add: ");
//        int num = sc.nextInt();
//        sc.nextLine();
//
//        for(int i=0; i<num; i++){
//            System.out.print("Enter food " + i + " : ");
//            String food = sc.nextLine();
//            foods.add(food);
//        }
//
//        System.out.println(foods);
//--------------------------------------------------------------------------------------------------------
    }

}
