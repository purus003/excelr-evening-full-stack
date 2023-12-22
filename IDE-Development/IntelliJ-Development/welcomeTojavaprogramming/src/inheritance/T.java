package inheritance;

 class AA{
     AA()
     {
         System.out.println(" AA() ");
     }
     AA(int i)
     {
         System.out.println("AA(int)");
     }
}
class BB extends AA{
     BB()
     {
         super(10);
         System.out.println("BB()");
     }
     BB(int i)
     {
         System.out.println("BB(int)");
     }
}
class CC extends BB{
     CC()
     {
         super(10);
         System.out.println("CC()");
     }
     CC(int i)
     {
         super(i);
         System.out.println("CC(int)");
     }
}
class T extends CC{
     T()
     {
         super(100);
         System.out.println("T()");
     }
     T(int i)
     {
         super(200);
         System.out.println("T(int)");
     }

    public static void main(String[] args) {
        AA a1 = new AA();
        System.out.println("--------");
        BB b1 = new BB();
        System.out.println("---------");
        CC c1 = new CC();
        System.out.println("----------");
        T t1 = new T();
        System.out.println("--------");

    }
}
