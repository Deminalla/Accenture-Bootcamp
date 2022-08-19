import java.util.*;

public class hashSet {
    public static void main (String[] args){
        // HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.
        HashSet<String> dessertList = new HashSet<>();
        dessertList.add("Pie");
        dessertList.add("Cake");
        dessertList.add("Cupcake");
        dessertList.add("Ice Cream");
        dessertList.add("Brownie");

        // Iterate through the hash set
        for (String element : dessertList){
            System.out.println(element);
        }
        // Can also do it with an iterator
        /*
        Iterator<String> it = dessertList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // will print in random order because it's a hashset
        }
         */
        // Compare two sets and retain elements which are same on both sets
        HashSet<String> dessertList2 = new HashSet<String>();
        dessertList2.add("Pie");
        dessertList2.add("Chocolate");
        dessertList2.add("Cupcake");
        dessertList2.add("Cookie");

        dessertList2.retainAll(dessertList);
        System.out.println("HashSet content: " + dessertList2); // [Cupcake, Pie]
    }
}
