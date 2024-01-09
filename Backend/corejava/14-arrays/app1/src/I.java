public class I
{
	public static void main(String[] args)
	{
		int[] x = new int[5];
		System.out.println(x[-1]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
	}
}
