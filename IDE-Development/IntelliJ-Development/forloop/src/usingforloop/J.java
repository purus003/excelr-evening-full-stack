package usingforloop;
import java.util.Scanner;
public class J {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = findSumOfDigits(n);
        System.out.println(sum);
    }
    public static int findSumOfDigits(int n){
        int sum = 0;
        for (int i = n ; i> 0; i /= 10)
        {
            sum += i%10;
        }
        return sum;

    }
}
// sumo of digits of number.