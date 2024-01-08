package polymorphism_overloading;

public class F {
    private void test()
    {
        System.out.println("from test");
    }
    public String test(String str)
    {
        System.out.println("from test (string)");
        return "anbc";
    }
    protected char test(char a, char b)
    {
        System.out.println("from char A,B");
        return 'a';
    }
    private String test(float a,float b)
    {
        System.out.println("from flaot ");
        return "abc";
    }
    boolean test(char a ,boolean b,char d)
    {
        System.out.println("test");
        return true;
    }

    public static void main(String[] args) {
        F f1 = new F();
        f1.test();
        f1.test("abc");
        f1.test(10.2f,20.2f);
        f1.test('a','b');
        f1.test('a',true,'b');


    }
}
