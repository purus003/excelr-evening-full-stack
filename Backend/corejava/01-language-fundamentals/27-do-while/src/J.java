class J
{
	public static void main(String[] args) 
	{
		int i = 0;
		loop1:
		do
		{
			System.out.println("loop1 begin: " + i);
			i++;
			int j = 0;
			do
			{
				System.out.println("loop2 begin:" + j);
				j++;
				if (j > 1)
				{
					continue loop1;
				}
				System.out.println("loop2 end:" + j);
			}
			while ( j<2);
			i++;
			System.out.println("loop1 end:" +i);
		}
		while (i<3);
	}
}
