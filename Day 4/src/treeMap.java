import java.util.*;

/*
Unlike hasmap, it will sort pair order according to keys (even if they're strings)
 */

public class treeMap {
    public static void main(String []args){
        // Create a tree map
        TreeMap<Integer,String> tree_map=new TreeMap<>();
        // Put elements to the map
        tree_map.put(1, "Red");
        tree_map.put(5, "Blue");
        tree_map.put(2, "Green");
        tree_map.put(4, "White");
        tree_map.put(3, "Black");

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
