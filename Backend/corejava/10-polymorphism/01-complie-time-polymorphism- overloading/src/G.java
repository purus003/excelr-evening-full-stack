class  G
{
	static private void test()
	{
		System.out.println("test()");
	}
	protected static string test(int i)
	{
		System.out.println("test(int)");
		return "abc";
	}
	public static  String test(String str)
	{
		System.out.println("test(String)");
		return "xyz";
	}
	private  static char test(){
		System.out.println("test(float,double)");
		return 'a';
	}
	static boolean test (char ch,String str, boolean b)
	{
		System.out.println("test(char,String,boolean)");
			return true;
	}
	public static void main(String[] args) 
	{
		G obj = new G();
		obj.test();
		obj.test(10);
		obj.test("abc");
		obj.test(10.0f,20.0);
		obj.test('a',"abc",true);

		System.out.println("done");
	}
}

