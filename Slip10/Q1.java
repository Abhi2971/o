import java.util.HashMap;
import java.util.Scanner;

public class CitySTDCodeConsole {
    public static void main(String[] args) {
        // Create a HashMap to store city names and their STD codes
        HashMap<String, String> citySTDMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        // Adding initial city names and their STD codes
        citySTDMap.put("New York", "212");
        citySTDMap.put("Los Angeles", "213");
        citySTDMap.put("Chicago", "312");

        while (true) {
            System.out.println("
1. Add City");
            System.out.println("2. Search City");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add City
                    System.out.print("Enter city name: ");
                    String cityName = scanner.nextLine();
                    System.out.print("Enter STD code: ");
                    String stdCode = scanner.nextLine();

                    if (!citySTDMap.containsKey(cityName)) {
                        citySTDMap.put(cityName, stdCode);
                        System.out.println("City added successfully!");
                    } else {
                        System.out.println("City already exists.");
                    }
                    break;

                case 2: // Search City
                    System.out.print("Enter city name to search: ");
                    String searchCity = scanner.nextLine();
                    if (citySTDMap.containsKey(searchCity)) {
                        System.out.println("STD code for " + searchCity + ": " + citySTDMap.get(searchCity));
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                case 3: // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

    