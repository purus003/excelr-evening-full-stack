package polymorphism_overloading;

public class B {
    static void test()
    {
        System.out.println("from test()");
    }
    static void test(int i)
    {
        System.out.println("from test(int)");
    }
    static void test(int i, int j)
    {
        System.out.println("from test(int,int)");
    }
    static void test(int i,int j, int k)
    {
        System.out.println("from test(int,int,int)");
    }

    public static void main(String[] args) {
        test();
        test(10);
        test(10,20);
        test(10,20,30);
        System.out.println("done");
    }
}
