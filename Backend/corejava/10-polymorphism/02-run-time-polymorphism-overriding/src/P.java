class  O 
{
	void test1()
	{
		System.out.println("from test1-M");
	}
}
class P extends O
{
	public void test1()
	{
		System.out.println("from test -P");
	}
	public static void main(String[] args) 
	{
		P obj1 = new P();
		obj1.test1();
		System.out.println("Hello World!");
	}
}
