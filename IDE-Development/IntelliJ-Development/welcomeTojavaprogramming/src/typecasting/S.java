package typecasting;

public class S {
    public static void main(String[] args) {
        double  d = 20.9;
        float f = (int)(double)(byte)(short)(int)(long)(double)(float)(double)d;
        System.out.println("f "+f);
    }
}
