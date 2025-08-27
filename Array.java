import java.util.Arrays;
import java.util.Scanner;
public class Array {
    // Array = Collection of values of same datatype.
    // It is like a variable that can store more than 1 value.
    public static void main(String[] args){
//--------------------------------------------------------------------------------------------------------------
// TWO DIMENSIONAL ARRAY:
//        char [][] telephone = {{'1','2','3'},
//                               {'4','5','6'},
//                               {'7','8','9'},
//                               {'*','0','#'}};   // [4][3]-->[row][col]
//
//        for(char[] row : telephone){
//            for(char num : row){
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//------------------------------------------------------------------------------------------
// SEARCH AN ELEMENT IN THE ARRAY :
//        Scanner sc = new Scanner(System.in);
//
//        String[] fruits = {"apple","orange","grapes"};
//        boolean isFound = false;
//        String target;
//
//        System.out.print("Enter the fruit to search: ");
//        target = sc.nextLine();
//
//
//        for(int i=0; i<fruits.length; i++){
//            if(fruits[i].equals(target)){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if(!isFound){
//            System.out.println("Target element Not Found!");
//        }

// USING INTEGER VALUES:
//        int[] nums = {5,6,3,7,8};
//        int target = 5;
//        boolean isFound = false;
//
//        for(int i=0; i<nums.length; i++){
//            if(target == nums[i]){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if(!isFound){
//            System.out.println("Target element Not Found!");
//        }
//------------------------------------------------------------------------------------------
// ENTER USER INPUT INTO AN ARRAY:
//        Scanner sc = new Scanner(System.in);
//        String[] fruits;
//        int count;
//
//        System.out.print("Enter the number of fruits:  ");
//        count = sc.nextInt();
//
//        sc.nextLine();
//
//        fruits = new String[count];
//
//        for(int i=0; i<fruits.length; i++){
//            System.out.printf("Enter the fruit [%d]: ",i);
//            fruits[i] = sc.nextLine();
//        }
//
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//-------------------------------------------------------------------------------------------
// ARRAY METHODS: (import java.util.Arrays;)
//        String[] fruits = {"apple","orange","grapes","banana"};
//        System.out.println(fruits.length);
//        System.out.println(Arrays.toString(fruits));
//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "pineapple");
//
//        int[] a = {1,2,3};
//        int[] b = {1,2,3};
//        System.out.println(Arrays.equals(a,b));
//
//        int[] arr = {5,7,3,6,8};
//        int index = Arrays.binarySearch(arr, 6);
//        System.out.println(index);
//---------------------------------------------------------------------------------------
// PRINTING ARRAYS: (FOR LOOP, FOR-EACH LOOP)
//        String[] fruits = {"apple","orange","grapes","banana"};

//        // Print array using for loop
//        for(int i=0; i<fruits.length; i++){
//            System.out.println(fruits[i]);
//        }
//
//
//        // Print array using Enhanced for loop or For-Each loop
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//-----------------------------------------------------------------------------------------
// BASIC ARRAY EXAMPLE (int, String, double):
//        String[] fruits = {"apple","orange","grapes","banana"};
//        System.out.println(fruits[0]);
//        fruits[0] = "pineapple";
//        System.out.println(fruits[0]);
//        System.out.println(fruits); // It will output its memory address

//        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[1]);
//        arr[0] = 6;
//        System.out.println(arr[0]);
//------------------------------------------------------------------------------------------

    }
}

