package typecasting;

public class H {
    static int test(byte b){
        return b;
    }

    public static void main(String[] args) {
        byte b = 10;
        System.out.println(test(b)+"done");
    }
}
