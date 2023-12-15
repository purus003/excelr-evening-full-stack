class PP
{
	PP(int i)
	{
		this();
		System.out.println("PP(int)");
	}

	PP()
	{
		System.out.println("PP()");
	}

	public static void main(String[] args) 
	{
		PP obj1 = new PP();
		PP obj2 = new PP(10);
		System.out.println("done");
	}
}