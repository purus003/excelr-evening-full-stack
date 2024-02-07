import java.util.Scanner;
public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=65 && n<=90)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
//check weatrher number is ASCII value of an UpperCase alphabet or Not.
//ASCII value of uppercase 65 to 90