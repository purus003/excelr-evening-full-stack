import java.util.Scanner;
class jaggedarraytwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[5];
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.println("enter the age of class" + i + "student" + j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("the ages are");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

}
