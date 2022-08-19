import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> drinkList = new LinkedList<String>();
        drinkList.add("Juice");
        drinkList.add("Coke");
        drinkList.add("Wine");
        drinkList.add("Water");
        drinkList.addFirst("Tea");
        drinkList.addLast("Cider");

        // iterate through all elements in a linked list starting at the specified position
        Iterator p = drinkList.listIterator(1);
        while (p.hasNext()) { // print list from 2nd position
            System.out.println(p.next());
        }
        // Print list elements in reverse order
        Iterator rev = drinkList.descendingIterator();
        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        drinkList.getFirst();
        drinkList.getLast();
    }
}
