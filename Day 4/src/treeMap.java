import java.util.*;

/*
Unlike hashmap, treemap will sort pair order according to keys (even if they're strings)
 */

public class treeMap {
    public static void main(String []args){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1, "Rose");
        treeMap.put(5, "Violet");
        treeMap.put(2, "Tulip");
        treeMap.put(4, "Dandelion");
        treeMap.put(3, "Sunflower");

        for (Map.Entry<Integer,String> entry : treeMap.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        if(treeMap.containsKey(4)){ // searching whether a key exists
            System.out.println("The value stores in key 4 is " + treeMap.get(4));
        }
        else {
            System.out.println("The Tree Map does not contain key 4");
        }

        if(treeMap.containsValue("Lily")){
            System.out.println("The TreeMap contains value Lily");
        }
        else {
            System.out.println("The TreeMap does not contain value Lily");
        }

        System.out.println("Reverse order view of the keys: " + treeMap.descendingKeySet()); // [5, 4, 3, 2, 1]

        System.out.println("Remove least key which is " + treeMap.pollFirstEntry()); // 1=Rose (the opposite is pollLastEntry)

        System.out.println("Submap of key values [2; 5): " + treeMap.subMap(2,true,5,false));


        // Greater, less, equal  vv
        System.out.println("Greatest key: " + treeMap.firstEntry()); // 1=Rose (not how elements were inserted, but how things look after sorting)
        System.out.println("Least key: " + treeMap.lastEntry()); // 5=Violet (will show the pair based on the lowest key)
        System.out.println("Greatest key: " + treeMap.firstKey()); // 1 (will show only the key)
        System.out.println("Least key: " + treeMap.lastKey()); // 5

        System.out.println("Key-value that is less or equal to 3: " + treeMap.floorEntry(3)); // 3=Sunflower
        //System.out.println("Key that is less or equal to 6: " + treeMap.floorKey(6)); // 5 (will only show key)
        System.out.println("Key-value that is greater or equal to 3: " + treeMap.ceilingEntry(3)); // 3=Sunflower
        System.out.println("Key-value that is greater than 3: " + treeMap.higherEntry(3)); // 4=Dandelion
        System.out.println("Key-value that is less than 3: " + treeMap.lowerEntry(3)); // 2=Tulip

        System.out.println("Key-values that are less than 4: " + treeMap.headMap(4)); // {1=Rose, 2=Tulip, 3=Sunflower}
        System.out.println("Key-values that are less or equal to 4: " + treeMap.headMap(4, true)); // {1=Rose, 2=Tulip, 3=Sunflower, 4=Dandelion}
        System.out.println("Key-values that are greater than 4: " + treeMap.tailMap(4, false)); // {5=Violet}
        System.out.println("Key-values that are greater or equal to 4: " + treeMap.tailMap(4)); // {4=Dandelion, 5=Violet}
        // Greater, less, equal  ^^


    }
}
