package typecasein2;

public class M17 {
    public static void main(String[] args) {
        Ancestor ancestor1 = new GrandFather();
        GrandFather grandFather = (GrandFather) ancestor1;
        System.out.println("---------");
        Ancestor ancestor2 = new Ancestor();
        GrandFather grandFather1 = (GrandFather) ancestor2;
    }
}
