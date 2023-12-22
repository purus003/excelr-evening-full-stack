package inheritance;

import java.sql.SQLOutput;

class DriverClass {
    public static void main(String[] args) {
        System.out.println(" from driver class");
    }
}
class Derived1 extends DriverClass{
    static int i;
    static
    {
        Derived1.main(null);
    }

    public static void main(String[] args) {
        System.out.println("from Derived1 class");
    }
}
class Derived2 extends DriverClass{
    static int j;
    static {
        Derived2.main(null);
    }

    public static void main(String[] args) {
        System.out.println("from Dervied2 class");
    }
}
class MainClass{
    public static void main(String[] args) {
        System.out.println("MainClass begin");
        System.out.println(Derived1.i);
        System.out.println(Derived2.j);
        System.out.println("MianClass end");
    }
}
