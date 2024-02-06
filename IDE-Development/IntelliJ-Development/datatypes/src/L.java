import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double pi = 3.142;
        double area = 2*pi*r*(r+h);
        System.out.println(area);
    }
}
//cylinder surface area.