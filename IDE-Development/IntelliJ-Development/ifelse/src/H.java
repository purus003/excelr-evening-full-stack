import java.util.Scanner;
public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 100 && n <= 999 && n%10 ==0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
// number is  three digit number  and multiple of 10 or not