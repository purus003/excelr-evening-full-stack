import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0)
        {
            System.out.println("positve");
        }
        else if ( n < 0)
        {
            System.out.println("negatieve");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
// check weather number is positiev or not