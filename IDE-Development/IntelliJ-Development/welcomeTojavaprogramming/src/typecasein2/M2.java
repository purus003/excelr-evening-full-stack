package typecasein2;

public class M2 {
    public static void main(String[] args) {
        Object obj = null;
        A a1 = null;
        B b1 = null;
        C c1 = null;
        D d1 = null;//null is keyword which is not pointing any where
        System.out.println("obj "+ obj +" ,"+" a1" +a1 +", "+"b1 "+ b1 +", "+"c1"+ c1 +","+"d1"+ d1);
        System.out.println("--------");
        obj = new Object();// re assigning to  new object
        a1 = new A();
        b1 = new B();
        c1 = new C();
        d1 = new D();// it gives address of the objects
        System.out.println("obj "+ obj +" ,"+" a1" +a1 +", "+"b1 "+ b1 +", "+"c1"+ c1 +","+"d1"+ d1);
        System.out.println("done");


    }
}
/*
homogenious assignment example
A a1 = new A();

non homogenious assignment example
object obj = new A();
 */
