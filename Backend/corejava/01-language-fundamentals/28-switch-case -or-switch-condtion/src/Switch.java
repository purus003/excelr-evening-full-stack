public class Switch {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 0; i < 3; i++) {
            switch (x) {
                case 5:
                    System.out.println("Value is 5");
                    break;
                case 10:
                    System.out.println("Value is 10");
                    break;
                default:
                    System.out.println("Other value");
            }
        }
    }
}