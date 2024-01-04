class  W
{
	public static void test1()
	{
		System.out.println("from test.W");
	}
}
class X extends W
{
	public static void test1()
	{
		System.out.println("from test.X");
	}
	public static void main(String[] args) 
	{
		W obj = new X();// static methods  prefernce  is refernce are going resloved complie time error
		obj.test1();
		System.out.println("Hello World!");
	}
}
