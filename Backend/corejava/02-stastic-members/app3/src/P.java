class P 
{
	static 
	{
		String s1 = "kh";
		System.out.println(s1);
		 // fileld initialization before its decleration is possible
		 i = 20;
	}
	static int i = 10;
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}