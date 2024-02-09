package usingforloop;
import java.util.Scanner;
public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1 ; i<=n; i++)
        {
            if (i%2 == 0 || i%3 == 0){
                System.out.println(i);
            }
        }
    }
}
// write a program to print all the numbers are  multiples of either  2 or 3