package typecasein2;

public class M11 {
    public static void main(String[] args) {
        Ancestor ancestor1 =(Ancestor) new GrandFather();//explixt typecasting
        Ancestor ancestor2 = new GrandFather();
        Father father = new Father();
        Father father2 = (Father) new Son();//explixt typecasting
        System.out.println("done");


    }
}
