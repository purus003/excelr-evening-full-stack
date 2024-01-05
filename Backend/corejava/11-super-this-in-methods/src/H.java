class G
{
	public static void test()
	{
		System.out.println("from G test()");
	}
}
class H extends G
{
	public void test(int i)
	{
		super.test();
		System.out.println("from F test(int)");
	}
   public static void main(String... args)
	{
		H obj = new H();
		obj.test();
		obj.test(10);
		System.out.println("done");
	}
}
// non static variable super cannot be refered from static methods