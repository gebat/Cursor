/**
 * Main entry point of the application.
 * Includes a utility function to convert a user's name into a number based on letter positions.
 */
public class Main {
    public static void main(String[] args) {
        // Example usage
        String name = "Ada Lovelace";
        int value = nameToNumber(name);
        System.out.println("The value of the name \"" + name + "\" is: " + value);
    }

    /**
     * Returns the sum of all letters of the input name based on their position in the alphabet (A/a=1, ..., Z/z=26).
     * Non-letter characters are ignored.
     *
     * @param fullName The user's full name.
     * @return The sum of letter positions in the name.
     */
    public static int nameToNumber(String fullName) {
        int sum = 0;
        if (fullName == null) {
            return 0;
        }
        for (char c : fullName.trim().toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sum += (c - 'A' + 1);
            }
        }
        return sum;
    }
}