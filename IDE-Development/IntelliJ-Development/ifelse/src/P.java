import java.util.Scanner;
public class P {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n%2==0 && m%2==0)
        {
            System.out.println(n*m);
        }
        else {
            System.out.println(n+m);
        }
    }

}
// numbers are even print their product.
// numbers or odd print thier sum.