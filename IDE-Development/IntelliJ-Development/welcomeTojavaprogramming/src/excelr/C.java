package excelr;
// object reference  we are supplying a method return value
public class C {
    int i;
    static C test()
    {
        C c1 = new C();
        c1.i = 10;
        return c1;
    }

    public static void main(String[] args) {
        C obj = test();
        System.out.println(obj.i);
    }
}
