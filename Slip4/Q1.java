import java.util.HashMap;
import java.util.Scanner;

public class CitySTDCodeDemo {
    public static void main(String[] args) {
        // Create a HashMap to store city names and their STD codes
        HashMap<String, String> citySTDMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding city names and their STD codes
        citySTDMap.put("New York", "212");
        citySTDMap.put("Los Angeles", "213");
        citySTDMap.put("Chicago", "312");

        // Adding a new city
        System.out.println("Enter a city name and its STD code to add:");
        String cityName = scanner.nextLine();
        String stdCode = scanner.nextLine();

        if (!citySTDMap.containsKey(cityName)) {
            citySTDMap.put(cityName, stdCode);
            System.out.println("City added successfully!");
        } else {
            System.out.println("City already exists.");
        }

        // Searching for a city name
        System.out.println("Enter a city name to search for its STD code:");
        String searchCity = scanner.nextLine();
        if (citySTDMap.containsKey(searchCity)) {
            System.out.println("STD code for " + searchCity + ": " + citySTDMap.get(searchCity));
        } else {
            System.out.println("City not found.");
        }

        // Closing the scanner
        scanner.close();
    }
}

    