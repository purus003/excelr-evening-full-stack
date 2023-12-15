public class SwitchExample {
    public static void main(String[] args) {
        int num = 5;
        switch (num) {
            case 1:
                System.out.println("One");
            case 5:
                System.out.println("Five");
            case 10:
                System.out.println("Ten");
            default:
                System.out.println("Default case");
        }
    }
}