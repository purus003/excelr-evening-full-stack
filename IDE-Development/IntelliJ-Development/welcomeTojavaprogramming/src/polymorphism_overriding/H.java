package polymorphism_overriding;

class G {
    void test()
    {
        System.out.println("from test -G");
    }
}
class H extends G{
    void test(){
        System.out.println("fom test H");
    }

    public static void main(String[] args) {
        G g1 = new G();
        g1.test();

        G g2 = new G();
        g2.test();
        System.out.println("done");
    }
}
