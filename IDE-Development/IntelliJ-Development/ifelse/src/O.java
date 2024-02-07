import java.util.Scanner;
public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        if (n>=48 && n<=57)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
//check a number weather ascii value or not
// ascii number values between 48 to 57