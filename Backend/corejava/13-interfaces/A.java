interface A
{
    void test1();
}
interface C
{
	void test1();
}
class G implements A,C
{
	public static void test1()
	{
		System.out.println("from test1");
	}
	public static  void test1()
	{
		System.out.println("Hello World!");
	}
	public static void main(String[] args) 
	{
		test1();
		System.out.println("Hello World!");
	}
}
