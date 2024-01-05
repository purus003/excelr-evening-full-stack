class S 
{
	private void test1()
	{
		System.out.println("fom test -s");
	}
}
class T extends S
{
	private void test1()
	// void test()
	// protected test()
	//public test()
	{
		System.out.println("from test -T");
	}
	public static void main(String[] args) 
	{
		T obj1 = new T();
		obj1.test1();
		System.out.println("Hello World!");
	}
}
