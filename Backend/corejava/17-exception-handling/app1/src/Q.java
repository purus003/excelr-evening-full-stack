class Q
{
	public static void main(String[] args) 
	{
		System.out.println("customer care asked for vegitables");
		try
		{
			System.out.println("checking veggies");
			int i = 10 / 0;
			System.out.println("veggies are good");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("bad condtion veggies");
		}
		System.out.println("customer happy with  provided good veggies");
	}
}