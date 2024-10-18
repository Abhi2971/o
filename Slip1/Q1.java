public class DisplayAlphabets {
    public static void main(String[] args) {
        // Loop through characters from 'A' to 'Z'
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            System.out.println(alphabet);
            try {
                // Sleep for 2 seconds (2000 milliseconds)
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

    