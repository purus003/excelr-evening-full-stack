//reverse string. with out using methods
class P 
{
	public static void main(String[] args) 
	{
		String s1 = "vijay";
		char[] c1 = s1.toCharArray();
		System.out.println("before reverse: " + s1);
		System.out.print("after reverse: ");
		for (int i = c1.length - 1; i >= 0; i--)
		{
			System.out.print(c1[i]);
		}
		System.out.print("\ncharAt Approach: ");
		for (int i = s1.length() - 1; i >= 0; i--)
		{
			System.out.print(s1.charAt(i));
		}
	}
}
