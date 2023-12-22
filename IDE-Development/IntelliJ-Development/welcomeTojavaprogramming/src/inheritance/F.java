package inheritance;

class EE {
    static int i;

    public static void main(String[] args) {
        System.out.println(" from E main");
    }
}
class FF extends EE{
    static int j;

    static {
        FF obj = new FF();
        obj.main(null);
    }

    public static void main(String[] args) {
        FF f1 = new FF();
        System.out.println(f1.i);
        System.out.println(f1.j);
        System.out.println("---------");
        System.out.println(f1.i);
        System.out.println(f1.j);
    }
}
class G{
    public static void main(String[] args) {
        System.out.println(FF.i);
        System.out.println(FF.j);
    }
}
