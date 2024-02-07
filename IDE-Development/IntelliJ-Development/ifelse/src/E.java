import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%5 == 0 && n% 3 == 0 && n%7 == 0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
// number is multiple  of 5 & 3,7 or not.