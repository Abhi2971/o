import java.util.*;

public class SortedIntegerCollection {
    public static void main(String[] args) {
        // Create a TreeSet to store integers (which automatically sorts and avoids duplicates)
        Set<Integer> integerSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        // Accept 'n' integers from the user
        System.out.println("Enter the number of integers you want to input:");
        int n = scanner.nextInt();
        System.out.println("Please enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            integerSet.add(num);  // Add to the set (duplicates will be ignored)
        }

        // Display sorted integers
        System.out.println("Sorted integers: " + integerSet);

        // Search for a specific integer
        System.out.println("Enter an integer to search for:");
        int searchNum = scanner.nextInt();

        if (integerSet.contains(searchNum)) {
            System.out.println(searchNum + " is found in the collection.");
        } else {
            System.out.println(searchNum + " is not found in the collection.");
        }

        // Closing the scanner
        scanner.close();
    }
}

    