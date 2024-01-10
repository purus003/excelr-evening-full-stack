class F 
{
	public static void main(String[] args) 
	{
		int x[] = new int[5];
		System.out.println(x.length);
		System.out.println("----------");
		for (int i = 0;i < x.length ; i++ )
		{
			System.out.println(i);
		}
		System.out.println("----------");
		x[3]=200;
		for(int i : x)
		{
			if (i == x[3])
			{
              System.out.println(i);
			}
		}

	}
}
