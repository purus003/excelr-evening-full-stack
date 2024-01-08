package polymorphism_overloading;

import sun.security.krb5.internal.CredentialsUtil;

public class C {
    static void test()
    {
        System.out.println("from test()");
    }
    static String test(int i)
    {
        System.out.println("from test(int)");
        return "bc";
    }
    static char test(int i ,int j)
    {
        System.out.println("from(int ,int)");
        return 'a';
    }
    static boolean test( int i , int j , int k, String str)
    {
        System.out.println("from (test(int, int ,int ,chinna)");
        return true;
    }
    static String test(String str1)
    {
        System.out.println("purushotham");
        return "bc";
    }

    public static void main(String[] args) {
        test();
        test(10);
        test(10,20);
        test(10,20,30,"bijje");
        test("bijje");
        System.out.println("done");
    }
}
