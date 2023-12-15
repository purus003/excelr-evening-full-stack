class CC 
{
	static 
	{
		System.out.println("CC-sib1");
	}
	{
		System.out.println("CC- IIB1");
	}
	CC()
	{
		System.out.println("CC()");
	}
	CC(int i)
	{
		this(10,20);
		System.out.println("CC(int)");
	}
	CC(int i,int j)
	{
		this();
		System.out.println("CC(int,int)");
	}
	public static void main(String[] args) 
	{
		CC c1 = new CC();
		System.out.println("---------");
		CC c2 = new CC();
		System.out.println("---------");
		CC c3 = new CC(90);
		System.out.println("---------");
		CC c4 = new CC(10,20);
		System.out.println("---------");
	}
	static 
	{
		System.out.println("CC-sib2");
	}
	{
		System.out.println("CC- IIB2");
	}
}
