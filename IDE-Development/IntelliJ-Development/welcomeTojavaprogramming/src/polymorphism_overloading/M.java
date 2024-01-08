package polymorphism_overloading;

class L{
     public void test()
    {
        System.out.println("fom test()");
    }
}
class M extends L{
    static  public void test(int i)
    {
        System.out.println("from test(int)");
    }

    public static void main(String[] args) {
        M m1 = new M();
        m1.test();
        m1.test(10);
    }
}
