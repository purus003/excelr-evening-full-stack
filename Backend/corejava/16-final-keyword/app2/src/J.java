class J
{
	static
	{
		System.out.println(i);
	}

	static final int i = 100; /* illegal forward reference
                System.out.println(i);
                                   ^*/
}