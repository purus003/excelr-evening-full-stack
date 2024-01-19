class H
{
	int test()
	{
		try
		{
			//code
			return 10;
		}
		catch (ArithmeticException ex)
		{
			//code
		}
		catch (NullPointerException ex)
		{
			//code
		}
		finally
		{
			return 20;
		}
		public static void main(String... args)
		{
			System.out.println(test());
		}
	}
}
// return 20 is return 10   so there is no error.