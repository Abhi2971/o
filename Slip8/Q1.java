import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class FriendNamesLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store friend names
        LinkedList<String> friendList = new LinkedList<>();

        // Accept number of names from the user
        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Read names of friends
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of friend " + (i + 1) + ": ");
            String name = scanner.nextLine();
            friendList.add(name); // Add name to the linked list
        }

        // Display contents using ListIterator
        System.out.println("
Friend names using ListIterator:");
        ListIterator<String> iterator = friendList.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Closing the scanner
        scanner.close();
    }
}

    