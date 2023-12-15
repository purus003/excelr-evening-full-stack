class EE 
{
	static int i = 30;
	static 
	{
		System.out.println("EE-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class FF
{
	static 
	{
		System.out.println("FF-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("FF-SIB main");
		System.out.println(EE.i);
		System.out.println(EE.i);
		System.out.println(EE.i);
		System.out.println("FF-SIB end");
	}
}