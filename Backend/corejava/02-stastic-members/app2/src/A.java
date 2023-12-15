class A 
{
	static int test1()
	{
		return 100;
	}
	static int sum = test1() + test2();

	public static void main(String[] args) 
	{
		System.out.println(sum);
	}
	static int test2()
	{
		return 200;
	}
}
