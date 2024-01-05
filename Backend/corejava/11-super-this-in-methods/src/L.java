class L
{
	public  static void test()
	{
		this.test(10);
		System.out.println("from L test()");
	}
	public static void test(int i)
	{
		System.out.println("from L test(int)");
	}
   public static void main(String... args)
	{
		L obj = new L();
		obj.test();
		obj.test(10);
		System.out.println("done");
	}
}