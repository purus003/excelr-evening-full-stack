import java.util.Scanner;
public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 100 && n <= 999)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
// number is  three digit number or not