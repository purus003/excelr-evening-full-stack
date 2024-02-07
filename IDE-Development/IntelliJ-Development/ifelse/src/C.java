import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%10 == 0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
// number is multiple of 10 or not
