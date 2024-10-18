import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnectionDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a URL from the user
        System.out.print("Enter a URL: ");
        String urlString = scanner.nextLine();

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            URLConnection urlConnection = url.openConnection();

            // Display connection information
            System.out.println("Content Type: " + urlConnection.getContentType());
            System.out.println("Last Modified: " + urlConnection.getLastModified());

            // Note: The creation date is generally not available, 
            // so we'll just mention that in the output
            System.out.println("Creation date information is not typically available.");
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}

    