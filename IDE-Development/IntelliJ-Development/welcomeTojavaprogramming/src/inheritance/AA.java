package inheritance;

import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("123 456 789");
        int sum = 0;
        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}