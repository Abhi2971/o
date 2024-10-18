import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FriendNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashSet to store friend names
        Set<String> friendSet = new HashSet<>();

        // Accept number of names from the user
        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Read names of friends
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of friend " + (i + 1) + ": ");
            String name = scanner.nextLine();
            friendSet.add(name); // Add name to the set
        }

        // Convert the HashSet to a TreeSet to get names in ascending order
        TreeSet<String> sortedFriends = new TreeSet<>(friendSet);

        // Display names in ascending order
        System.out.println("Friend names in ascending order:");
        for (String friend : sortedFriends) {
            System.out.println(friend);
        }

        // Closing the scanner
        scanner.close();
    }
}

    