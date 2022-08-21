import java.util.*;

/*
What is priority?
The element with the lowest value can be assigned the highest priority, and the highest value - lowest priority (ascending). Default
The reverse case can also be used. Highest value - the highest priority and the lowest value - lowest priority (descending)
Also, the priority can be assigned according to our needs

Insertion
It will store elements with the max sorting algorithm. In which case it's a binary tree and it will originally add everything in the insertion oder.
Then swap parent with child node in a way so that in the end the parent nodes are always larger/smaller or equal to their children

Removal.
The first element (the highest priority) gets removed
In a max/min heap, the maximum/minimum element is the root node. And it will remove the element which has maximum priority first
It will sort itself to become a max/min heap again
 */

public class priorityQ {
    public static void main (String[]args){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Wolf");
        queue.add("Deer");
        queue.add("Fox");
        queue.add("Penguin");
        System.out.println("Elements of the Priority Queue: " + queue);
        /*
        for (String element : pq) {
            System.out.println(element);
        }
         */
        PriorityQueue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder()); // descending order
        queue2.add("Kangaroo");
        queue2.addAll(queue); // add queue to queue2
        System.out.println(queue2);

        System.out.println(queue.peek()); // will show parent node (top/highest priority element)
        queue2.remove(); // will remove top by default if not stated otherwise
        queue.poll(); // same thing as remove, only this will return null instead of exception if the q is empty
        System.out.println(queue2);

        // convert a priority queue to an array containing all of the elements of the queue
        List<String> array_list = new ArrayList<String>(queue);
        System.out.println("Array containing all of the elements in the queue: " + array_list);
        // convert pq to a string
        System.out.println("String representation of the Priority Queue: " + queue.toString());
    }
}
