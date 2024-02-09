package usingforloop;
import java.util.Scanner;
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =2 ; i<=n; i++)
        {
            if (i%3 == 0 || i%5==0 || i%7==0){
                System.out.print(i+ " ");
            }
        }
    }
}
//write a program to print all the numbers which are multiples of either 3,5and 7
