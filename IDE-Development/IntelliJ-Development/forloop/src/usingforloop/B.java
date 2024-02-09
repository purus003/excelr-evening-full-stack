package usingforloop;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i<= n; i++)
        {
            System.out.println(i*2 +" ");
        }
    }
}
// write a program for for to print the first N even natural numbers.