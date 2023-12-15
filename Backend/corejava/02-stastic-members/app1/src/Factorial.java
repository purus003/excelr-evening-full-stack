class Factorial 
{
	public static void main(String[] args) 
	{
		int i ,fact;
		int number = 4;
		for (i = 1; i<= number ; i++ )
		{
			fact = fact*i;
		}
		System.out.println("factorial of " + number + "is" + fact  );
	}
}
