class A 
{
	public static void main(String[] args) 
	{
		int i = 10; 
		final int j = 20;
		System.out.println(i);
		System.out.println(j);
		 i = 24;
		 System.out.println(i);
		 j = 22;

	}
}
// error: cannot assign a value to final variable j
                 //j = 22;