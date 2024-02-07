import java.util.Scanner;
public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l =sc.nextInt();
        int min1 = ((n<m) ? n : m);
        int min2 = ((m<l)? m:l);
        System.out.println((min1<min2 )? min1 :min2);
    }
}
// min of three numbers.