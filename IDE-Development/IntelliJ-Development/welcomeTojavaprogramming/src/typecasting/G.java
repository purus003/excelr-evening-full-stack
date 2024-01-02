package typecasting;

public class G {
    static void test(double d){
        System.out.println("test(double)"+d);
    }
    public static void main(String[] args) {
        int i = 10;
        test(i);
        System.out.println("done");
    }
}
