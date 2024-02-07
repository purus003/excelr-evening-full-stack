import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=97 && n<=122)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
//check weatrher number is ASCII value of an lowerCase alphabet or Not.
//ASCII value of lowercase 97 to 122