class M30
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");

	}
	static boolean test()// method can have any kind of return type .according to the return type  give return values.
	{
		System.out.println("from test");
		return false;
	}
}
