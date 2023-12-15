class M35 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end");
	}
	static boolean test()// method calling
	// well get return value as printed
	{
		System.out.println("from test");
		return true;
	}
}