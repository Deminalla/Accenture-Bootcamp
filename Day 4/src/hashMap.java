import java.util.*;

/*HashMap Stores elements in form of key-value pair
Each element has its corresponding key which is required for its retrieval during iteration
 */

public class hashMap {
    public static void main(String []args) {
        HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
        hash_map.put(1, "Saturn");
        hash_map.put(2, "Mercury");
        hash_map.put(3, "Neptune");
        hash_map.put(4, "Venus");
        hash_map.put(5, "Jupiter");

        for(Map.Entry pair: hash_map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        /*
        for (String value : hash_map.values()) { // to only get values
           // ...
        }
        for (Integer key : hash_map.keySet()) { // to only get keys
            // ...
        }
         */

        // test if a map contains a mapping for the specified key
        System.out.println("Does the key '7' exist?");
        if (hash_map.containsKey(7)) {
            System.out.println("Yes - " + hash_map.get(7));
        }
        else {
            System.out.println("No");
        }
        // test if a map contains a mapping for the specified value
        System.out.println("Does the value 'Jupiter' exist?");
        if (hash_map.containsValue("Jupiter")) {
            System.out.println("Yes"); // how hashmaps work: have the key, look for the object. Can't do the reverse
        }
        else {
            System.out.println("No");
        }

        // create set view for the map
        Set mapSet = hash_map.entrySet();
        System.out.println("Set values: " + mapSet); // [1=Saturn, 2=Mercury,......]

        // get keyset value and value from map
        Set keySet = hash_map.keySet();
        System.out.println("Key set values are: " + keySet); // [1, 2, 3, 4, 5]
    }
}
