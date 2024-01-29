package easy_level;
import java.util.Scanner;
public class twosumusingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums = new int[5];
        int target =  6;
        int i;
        int j;
        for(i = 0 ; i< nums.length ; i++)
        {
            System.out.println("enter the ages");
            nums[i]=sc.nextInt();
        }
        for(i = 0 ; i<nums.length ;i++)
        {
            for(j= i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]== target){
                    System.out.println(target);
                }
            }
        }
    }
}
