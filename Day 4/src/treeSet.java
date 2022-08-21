import java.util.*;

/*
Treeset does not allow duplicates, so it's used when you want a collection that contains unique elements
Treeset doesn't maintain the insertion order
 */

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> countryList = new TreeSet<>(); // self-balancing binary search tree
        countryList.add("Lithuania");
        countryList.add("Latvia");
        countryList.add("Germany");
        countryList.add("Italy");
        countryList.add("Japan");

        for(String element: countryList){
            System.out.println(element); // Prints out from the smallest element (starts from the very left of the tree)
        }

        System.out.println("Countries that are less than \"K\":"); // it's more comfortable to do this with numbers but oh well
        TreeSet<String> searchList = new TreeSet<>();
        searchList = (TreeSet)countryList.headSet("K");

        Iterator it = searchList.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }

        System.out.println("Greater or equal to K: " + countryList.ceiling("K")); // will show only 1 element (because this is a binary tree)
        System.out.println("Greater than K: " + countryList.higher("K"));
        System.out.println("ess or equal to K: " + countryList.floor("K"));
        System.out.println("Less than K: " + countryList.lower("K"));

        System.out.println("Removes the first(lowest) element: "+countryList.pollFirst());
        System.out.println("Removes Latvia from the list: "+countryList.remove("Latvia"));
    }
}
