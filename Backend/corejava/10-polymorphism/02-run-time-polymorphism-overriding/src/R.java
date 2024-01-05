class  Q
{
	public void test1()
	{
		System.out.println("from test1-Q");
	}
}
class R extends Q
{
	public void test1()
	{
		System.out.println("from test -R");
	}
	public static void main(String[] args) 
	{
		R obj1 = new R();
		obj1.test1();
		System.out.println("Hello World!");
	}
}
