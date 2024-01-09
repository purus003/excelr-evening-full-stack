interface M
{
   void test1();
   int test2(int i);
}
class N implements M
{
	public void test1()
	{
		System.out.println("from test1()");
	}
	public int test2(int i)
	{
		System.out.println("from test2()");
		return 10;
	}

	public static void main(String[] args) 
	{
		N n1 = new N();
		n1.test1();
		n1.test2(10);
		System.out.println("done");
	}
}
