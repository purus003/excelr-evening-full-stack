import java.util.Scanner;
public class V{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int min = n<m?n:m;
        System.out.println(min);
    }
}
// min of two numbers