import java.util.Scanner;
public class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = n>m ? n:m;
        System.out.println(max);
    }

}
// max of two numbers.