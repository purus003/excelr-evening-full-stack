class V
{
	@Deprecated// this method is not use recommend any where.
	void test1()
	{
	}
	void test2()
	{
	}
	//public void finalize()
	//{
		
	//}
}
class M18
{
	//to avoid the warnings by the compiler
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		V v1 = new V();
		v1.test1();
		v1.test2();
		System.out.println("done");
	}
}
