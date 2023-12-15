class R10 
{
	void test()
	{
		System.out.println(" from test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("mechanical");
		R10  obj1 = new R10();
		R10  obj2 = new R10();
		obj1.test();
		obj2.test();
	}
}
