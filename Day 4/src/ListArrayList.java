import java.util.*;

public class ListArrayList {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colorList = new ArrayList<String>(); // if you were to create an arraylist, then you would need to specify the number of indexes
        colorList.add("Yellow");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("White");
        colorList.add("Black");

        colorList.add(0, "Red"); // Red is now the 1st elements and everything else is pushed to go after it
        colorList.set(5, "Gray"); // Black is changed to Gray
        System.out.println(colorList.get(2)); // Green, retrieves an element at given index

        for (String color : colorList) { // Iterate through the elements
            System.out.println(color);
        }

        Collections.sort(colorList); // alphabetically
        Collections.reverse(colorList); // the opposite order of before
        Collections.shuffle(colorList); // sort randomly
        Collections.swap(colorList, 0, 2);
        System.out.println(colorList);

        if (colorList.contains("Purple")) { // searches for an alement in the list
            System.out.println("Found the color");
        }
        else {
            System.out.println("There is no such color");
        }

        System.out.println(colorList.subList(0, 3)); // will print elements 0-2, because 1st index is inclusive while the 2nd index is exclusive
        ((ArrayList<String>) colorList).trimToSize(); // trim it to the size of the arrayList, remove the unnecessary memory/space
        ((ArrayList<String>) colorList).ensureCapacity(10); // increase size of arrayList
    }
}
