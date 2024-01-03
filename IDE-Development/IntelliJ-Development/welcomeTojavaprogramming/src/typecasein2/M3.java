package typecasein2;

public class M3 {
    public static  void test(A ref){
        System.out.println("test(A)");
    }
    public static void main(String[] args) {
        A a1 = new A();
        test(a1);
        System.out.println("done");
    }
}
// call by reference