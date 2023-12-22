package inheritance;

class AAA {
    AAA()
    {
        System.out.println("A()");
    }
    AAA(int i)
    {
        this();
        System.out.println("A(int)");
    }
}
class BBB extends AAA{
    BBB()
    {
        super(10);
        System.out.println("B()");
    }
    BBB(int i){
        this();
        System.out.println("B(int)");
    }
}
class CCC extends BBB{
    CCC()
    {
        this(10);
        System.out.println("C()");
    }
    CCC(int i){
        super(i);
        System.out.println("C(int)");
    }
}
class U extends CCC{
    U()
    {
        this(90);
        System.out.println("U(int)");
    }
    U(int i)
    {
        super(200);
        System.out.println("U(int)");
    }

    public static void main(String[] args) {
        AAA a1 = new AAA();
        System.out.println("--------");
        BBB b1 = new BBB();
        System.out.println("---------");
        CCC c1 = new CCC();
        System.out.println("----------");
        U u1 = new U();
        System.out.println("--------");

        AAA a2 = new AAA();
        System.out.println("--------");
        BBB b2 = new BBB();
        System.out.println("---------");
        CCC c2 = new CCC();
        System.out.println("----------");
        U u2 = new U();
        System.out.println("--------");
    }
}