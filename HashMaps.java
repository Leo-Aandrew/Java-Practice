import java.util.Arrays;
import java.util.HashMap;

// HashMap = A data structure that stores key-value pairs.
//           Keys are unique, but values can be duplicated.
//           Does not maintain any order, but is memory efficient.
//           HashMap<Key, Value>

public class HashMaps {
    public static void main(String[] args){
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 50.60);
        map.put("orange", 70.50);
        map.put("banana", 10.30);

        System.out.println(map.get("apple"));
        map.remove("apple");
        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsValue(50.60));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));  // orange : 70.5
            // banana : 10.3
            // apple : 50.6
            // grapes : 3.0
        }
        System.out.println(map.keySet()); // [orange, banana, apple, grapes]

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found!");
        }
//-------------------------------------------------------------------------------
// FREQUENCY COUNT USING HASHMAP:-
//        HashMap<String, Integer> map = new HashMap<>();
//
//        String text = "abcaba";
//        String text1 = "";
//        for(int i=0; i<text.length(); i++){
//            text1 = text1 + text.charAt(i) + " ";
//        }
//        System.out.println(text1); // a b c a b a
//
//        for(String letter : text1.split(" ")){
//            map.put(letter, map.getOrDefault(letter, 0) + 1);
//        }
//        System.out.println(map); // {a=3, b=2, c=1}
//
//        for(String letter : map.keySet()){
//            System.out.println("The letter " + letter + " occurs " + map.get(letter) + " times.");
//        }
//        // The letter a occurs 3 times.
//        // The letter b occurs 2 times.
//        // The letter c occurs 1 times.
    }
}
