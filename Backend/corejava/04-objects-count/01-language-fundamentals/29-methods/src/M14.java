class M14 
{
	static void test()
	{
		System.out.println("from test");
		System.out.println("from test");
		if (true)
		{
			System.out.println("from test");
		}
		System.out.println("from test");
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test();
		System.out.println("from main end");	
	}
}
