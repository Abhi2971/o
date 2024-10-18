import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a URL from the user
        System.out.print("Enter a URL: ");
        String urlString = scanner.nextLine();

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Display the different fields of the URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}

    