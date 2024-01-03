package typecasting;

public class charToInt {
    public static void main(String[] args) {
        char ch = 'b';
        int i =(int)ch;//manual type casting
        System.out.println(i);
    }
}
class char_int{
    public static void main(String[] args) {
        char ch = 'N';
        int j = ch;//auto typecasting
        System.out.println(j);
    }
}
