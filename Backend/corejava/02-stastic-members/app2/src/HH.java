class HH 
{
	static int i = test();
	static int test()
	{
		System.out.println("from test begin");
		main(null);
		System.out.println("from  test end ");
		return 300;
	}
	public static void main(String[] args) 
	{
		System.out.println("done:" + i);
	}
}
