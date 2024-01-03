import java.util.Scanner;
class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("3.14 2.71 1.61");
        double product = 1.0;
        while(scanner.hasNextDouble()) {
            product *= scanner.nextDouble();
        }
        System.out.println("Product: " + product);
        scanner.close();
    }
}