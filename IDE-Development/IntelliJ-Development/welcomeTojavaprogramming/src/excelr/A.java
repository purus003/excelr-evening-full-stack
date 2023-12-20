package excelr;
// call by value
public class A {
    int i;
    static void test (int i)
    {
        System.out.println("from test begin :" + i);
        i = 25;
        System.out.println("from test end :" + i);

    }

    public static void main(String[] args) {
         A a1 = new A();
        System.out.println("main begin " + a1.i);
        a1.i = 22;
        test(a1.i);
        System.out.println("main end " + a1.i);

    }

}
