import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of String objects
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Add a new element at the end of the list
        list.add("Elderberry");

        // Display the contents of the list
        System.out.println("Original LinkedList: " + list);

        // Display the contents of the list in reverse order
        System.out.print("LinkedList in Reverse Order: ");
        ListIterator<String> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}

    