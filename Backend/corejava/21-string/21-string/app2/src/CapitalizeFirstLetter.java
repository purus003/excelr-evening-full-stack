import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = capitalizeFirstLetter(input);

        System.out.println("Result: " + result);
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Convert the first letter to uppercase and the rest to lowercase
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}