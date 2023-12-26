class A1
{
	static int x;
	A1()
	{
		x +=30;
	}
	{
		x +=20;
	}
	void test1()
	{
		x += 40;
	}
	static void test2()
	{
		x +=40;
	}
	public static void main(String[] args) 
	{
		System.out.println("A" + x);
		A1 a1 = new A1();
		System.out.println("B" + x);
		a1.test1();
		System.out.println("C" + x);
		test2();
		System.out.println("D" + x);
	}
}
