
import java.util.Scanner;
 class oneDimensionFor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("enter the ages");
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }

}
