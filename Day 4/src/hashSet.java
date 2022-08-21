import java.util.*;

/*
Hashset does not allow duplicates, so it's used when you want a collection that contains unique elements
HashSet doesn't maintain the insertion order. The elements are inserted on the basis of their hashcode (does this by hashing) (looks random to me)
 */

public class hashSet {
    public static void main (String[] args){
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
        System.out.println("HashSet2 content: " + dessertList2); // [Cupcake, Pie]
    }
}
