class M15 
{
	static void test()//code reusability for develop methods
	{
		System.out.println("from test");
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test();
		test();
		test();
		test();
		System.out.println("from main end");	
	}
}
