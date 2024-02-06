class A 
{
	int i;
	static void test(int i)
	{
		System.out.println(i);
		i =20;
		System.out.println(i);

	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.i = 10;

		System.out.println(s1.i);
		test(s1.i);
		System.out.println(s1.i);
	}
}
