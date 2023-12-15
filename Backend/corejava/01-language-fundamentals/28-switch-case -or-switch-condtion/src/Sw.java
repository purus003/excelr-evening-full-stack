public class Sw {
    public static void main(String[] args) {
        int x = 10;
        String result = (x > 5) ? "Greater than 5" : switch (x) {
            case 5:
                yield "Equal to 5";
            case 10:
                yield "Equal to 10";
            default:
                yield "Other value";
        };
        System.out.println(result);
    }
}