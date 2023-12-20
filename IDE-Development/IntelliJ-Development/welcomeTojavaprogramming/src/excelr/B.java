package excelr;
// call by refernce
public class B {
    int i;
    static void test1(B any)
    {
        System.out.println("test1 begin" + any.i);
        any.i = 40;
        System.out.println("test1 end" + any.i);
        test2(any);

    }
    static void test2(B any)
    {
        System.out.println("test2 begin :"+ any.i);
        any.i =55;
        System.out.println("test2 end : "+ any.i);
    }

    public static void main(String[] args) {
        B b1 = new B();
        System.out.println("main begin :" + b1.i);
        b1.i = 20;
        test1(b1);
        System.out.println("main end :" + b1.i );
    }

}
