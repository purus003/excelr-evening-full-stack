class K 
{
	void test1()
	{
		System.out.println("from test1-K");
	}
}
class L extends K
{
	private void test1()
	{
		System.out.println("from test -L");
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();
		obj1.test1();
		System.out.println("Hello World!");
	}
}
