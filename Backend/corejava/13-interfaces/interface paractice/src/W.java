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
abstract class D implements A,B,C
{
   public void test1()
	{
		System.out.println(" from test1()");
	}
	public void test2()
	{
		System.out.println(" from test2()");
	}
}
class W extends D
{  
	public void test3()
	{
		System.out.println(" from test3()");
	}

	public static void main(String[] args) 
	{
		W w1 = new W();
		w1.test1();
		w1.test2();
		w1.test3();
		System.out.println("Hello World!");
	}
}
