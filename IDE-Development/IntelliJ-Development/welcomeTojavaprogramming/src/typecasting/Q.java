package typecasting;

public class Q {
    static void test(int i ){
        System.out.println("from(int:)"+i);
    }

    public static void main(String[] args) {
        byte b =10;test(b);
double d = 100.0;
test((int)d);
        System.out.println("done");
}
}