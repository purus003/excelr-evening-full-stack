import java.util.Scanner;
public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l =sc.nextInt();
        int max1 = ((n>m) ? n : m);
        int max2 = ((m>l)? m:l);
        System.out.println((max1>max2 )? max1 :max2);
    }
}
// max of three numbers.