public class Swit {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 5:
                System.out.println("Value is 5");
                break;
            case 10:
                System.out.println("Value is 10");
                continue;
            default:
                System.out.println("Other value");
        }
    }
}