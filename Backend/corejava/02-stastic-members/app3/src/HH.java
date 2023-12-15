class GG 
{
	static int i  = 42;
	static  
	{
		System.out.println("GG-SIB1");
	}
	static void test()
	{
		System.out.println("from test");
	}
	static  
	{
		System.out.println("GG-SIB2");
	}
	
}
class HH
{
	static
	{
		System.out.println("HH-SIB1");
	}
	public static void main(String[] args)
	{
		System.out.println("from main begin");
		System.out.println(GG.i);
		System.out.println(GG.i);
		GG.test();
		GG.test();
		System.out.println("from main end");
		
	}
	static
	{
		System.out.println("HH-SIB2");
	}

}