public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to the next line
        }
    }
}