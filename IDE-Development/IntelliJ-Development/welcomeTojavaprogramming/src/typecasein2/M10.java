package typecasein2;

public class M10 {
    static Object test1(){
        Son son = new Son();
        return son;
    }

    public static void main(String[] args) {
        Object obj = test1();
        System.out.println("done");
    }
}

