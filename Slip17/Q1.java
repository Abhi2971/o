import java.util.Scanner;

public class DisplayVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Loop through the string and check for vowels
        System.out.println("Vowels in the string:");
        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                System.out.print(ch + " ");
                try {
                    // Sleep for 3 seconds (3000 milliseconds)
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e);
                }
            }
        }

        // Closing the scanner
        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}

    