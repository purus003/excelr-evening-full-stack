package inheritance;
 class O{
     O()
     {
         System.out.println("from O()");
     }
}
class P extends O {
     P()
     {
         System.out.println("from P()");
     }
}
class Q extends P{
     Q()
     {
         System.out.println("from Q()");
     }
}
class R extends Q{
     R()
     {
         System.out.println("from R()");
     }
}
class S extends R{
     S()
     {
         System.out.println("from S()");
     }

    public static void main(String[] args) {
        O o1 = new O();
        System.out.println("-----");
        P p1 = new P();
        System.out.println("_______");
        Q q1 = new Q();
        System.out.println("----------");
        R r1 = new R();
        System.out.println("----------");
        S s1 = new S();
        System.out.println("--------");

    }
}