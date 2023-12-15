public class SA {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 5:
                System.out.println("Value is 5");
                break;
            case 10:
                System.out.println("Value is 10");
            case 7:
                System.out.println("Value is 7");
                break;
        }
        System.out.println("Outside switch");
    }
}