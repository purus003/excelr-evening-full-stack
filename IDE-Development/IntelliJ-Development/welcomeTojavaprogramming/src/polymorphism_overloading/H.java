package polymorphism_overloading;

class H {
    public void test()
    {
        System.out.println("from test()");
    }
}
class I extends H{
    public void test(int i)
    {
        System.out.println("from test(int)");
    }

    public static void main(String[] args) {
        I i1  = new I();
        i1.test();
        i1.test(10);
        System.out.println("done");
    }
}