interface A
{
	void test1();
}
interface B
{
	void test2();
}
interface C
{
	void test3();
}
interface D
{
	void test4();
}
class V implements A,B,C,D
{
	public void test1()
	{
		System.out.println(" from test1()");
	}
	public void test2()
	{
		System.out.println(" from test2()");
	}
	public void test3()
	{
		System.out.println(" from test3()");
	}
	public void test4()
	{
		System.out.println(" from test4()");
	}
	public static void main(String... args)
	{
		V v1 = new V();
		v1.test1();
		v1.test2();
		v1.test3();
		v1.test4();
	}
}
