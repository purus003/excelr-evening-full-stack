import java.sql.SQLOutput;
import java.util.Scanner;
public class oneDimensionalarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[5];
        System.out.println("enter the age");
        a[0]=sc.nextInt();
        System.out.println("enter the age");
        a[1] = sc.nextInt();
        System.out.println("enter the age");
        a[2]= sc.nextInt();
        System.out.println("enter the age");
        a[3]= sc.nextInt();
        System.out.println("enter the age");
        a[4]=sc.nextInt();
        System.out.println("the ages are");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);


    }
}
