class M32
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");

	}
	static int test()// method can have any kind of return type .according to the return type  give return values.
	{
		System.out.println("from test begin");
		boolean b = true;
		if (b)
		{
			return 100;
		}
		System.out.println("from test end");
		return 200;
	}
}