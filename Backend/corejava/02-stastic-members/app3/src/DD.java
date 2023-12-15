class CC 
{
	static 
	{
		System.out.println("C-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class DD
{
	static
	{
		System.out.println("D-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("from main D");
		CC.main(null);
		CC.main(args);
		System.out.println("from end D");
	}
}