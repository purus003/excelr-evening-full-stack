class V
{
	int test()
	{
		try
		{
			// int i = 10/0;
			return 10;	
		}
		catch (ArithmeticException ex)
		{
		}
		return 10;
	}
}
/*
 will gives error

*/