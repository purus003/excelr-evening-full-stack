class C
{
	static
	{
		System.out.println("C-SIB1");
	}
	{
		System.out.println("C-IIB1");
	}
	C()
	{
       System.out.println("C()");
	}
	C(int i)
	{
		this(10,20); 
		System.out.println("C(int)");
	}
	C(int i, int j)
	{
		this(); 
		System.out.println("C(int)");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("----------");
		C c2 = new C(90);
		System.out.println("----------");
		C c3 = new C(10,20);
		System.out.println("----------");
	}
	{
		System.out.println("B-IIB2");
	}
	static
	{
		System.out.println("C-SIB2");
	}
	
}

