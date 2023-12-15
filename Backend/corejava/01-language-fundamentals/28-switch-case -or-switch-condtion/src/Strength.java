public class Strength {
    public static void main(String[] args) {
        int i = 0;
        do {
            int x = 5;
            switch (x) {
                case 3:
                    System.out.println("Three");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                default:
                    System.out.println("Other");
            }
            i++;
        } while (i < 2);
    }
}