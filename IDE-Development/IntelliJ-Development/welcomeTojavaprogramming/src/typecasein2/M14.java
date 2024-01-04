package typecasein2;

public class M14 {
    static  void test(GrandFather grandFather){
        System.out.println("from test");
    }

    public static void main(String[] args) {
        Ancestor ancestor = new GrandFather();
        test((GrandFather)ancestor);
        System.out.println("done");

    }
}
