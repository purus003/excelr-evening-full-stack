class T 
{
	T()
	{
		this(10);
		System.out.println("T()");
		
	}
	T(int i)
	{
		this();
		System.out.println("T(int)");
	}

}
// recursion invokacation is not possible calling both each.