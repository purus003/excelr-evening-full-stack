import java.util.Scanner;

public class array3Dwithlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[2][3][5];
        int i, j, k;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                for (k = 0; k < a[i][j].length; k++) {
                    System.out.println("enter the ages");
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("the ages are");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                for (k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
