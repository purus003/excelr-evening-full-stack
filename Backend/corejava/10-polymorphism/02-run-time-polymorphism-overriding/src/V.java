class  U
{
	public static void test1()
	{
		System.out.println("from test.U");
	}
}
class V extends U
{
	public static void test1()
	{
		System.out.println("from test.V");
	}
	public static void main(String[] args) 
	{
		V obj = new V();
		obj.test1();
		System.out.println("Hello World!");
	}
}
