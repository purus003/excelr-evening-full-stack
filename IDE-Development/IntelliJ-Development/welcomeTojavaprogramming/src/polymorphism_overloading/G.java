package polymorphism_overloading;

public class G{
    private static void test()
    {
        System.out.println("from test");
    }
    public static String  test(String str)
    {
        System.out.println("from test (string)");
        return "anbc";
    }
    protected  static char  test(char a, char b)
    {
        System.out.println("from char A,B");
        return 'a';
    }
    private static String   test(float a,float b)
    {
        System.out.println("from flaot ");
        return "abc";
    }
    static boolean   test(char a ,boolean b,char d)
    {
        System.out.println("test");
        return true;
    }

    public static void main(String[] args) {

        test();
        test("abc");
        test(10.2f,20.2f);
        test('a','b');
        test('a',true,'b');


    }
}

