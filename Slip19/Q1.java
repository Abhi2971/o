import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListIntegerDemo {
    public static void main(String[] args) {
        // Create a LinkedList to store Integer objects
        LinkedList<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Add initial elements to the linked list
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        // Display initial size
        System.out.println("Initial size of the linked list: " + integerList.size());

        // Prompt user to add an element at the first position
        System.out.print("Enter an integer to add at the first position: ");
        int newElement = scanner.nextInt();
        integerList.addFirst(newElement);

        // Display the updated size
        System.out.println("Updated size of the linked list: " + integerList.size());

        // Optionally display the contents of the linked list
        System.out.println("Contents of the linked list: " + integerList);

        // Closing the scanner
        scanner.close();
    }
}

    