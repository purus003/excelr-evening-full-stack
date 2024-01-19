class D
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		finally
		{
			System.out.println("outer finally begin");
			try
			{	
				int j = 10/0;
			}
			catch(ArithmeticException ex)
			{
				System.out.println("from nested catch");
			}
			finally
			{
				System.out.println("nested finally");
			}
			System.out.println("outer finally end");
		}
		System.out.println("main end");
	}
}
