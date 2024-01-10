class B 
{
	public static void main(String[] args) 
	{
		final int i;
		i = 10;
		System.out.println(i);
		i = 20;
	}
}
//error: variable i might already have been assigned
            //    i = 20;