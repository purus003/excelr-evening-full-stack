package usingforloop;
import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ;i<=2*n ;i= i+2)
        {
            System.out.println(i);
        }

    }
}
//write a program for first N odd numbers.