import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=99 && n<=999 && n%10==0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
// weather a number is three digit number and mutiple of 2,5,10