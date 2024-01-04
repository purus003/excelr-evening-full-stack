package typecasein2;

public class M15 {
    static Father test(){
        Ancestor ancestor = new Son();
        return (Father) ancestor;
    }

    public static void main(String[] args) {
        Son  son = (Son)test();
        System.out.println("done");
    }

}
