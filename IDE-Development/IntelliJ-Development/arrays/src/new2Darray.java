import java.util.Scanner;
class new2Darray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]a = new int[2][5];
        int i,j;
        for (i = 0; i < 2; i++) {
            for(j = 0 ; j < 5; j++) {
                System.out.println("enter the ages");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("the ages are");
        for (i = 0; i < 2; i++) {
            for(j = 0 ; j< 5 ;j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

    }

}