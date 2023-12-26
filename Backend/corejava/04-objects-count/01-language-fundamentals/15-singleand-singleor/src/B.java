class B 
{
	public static void main(String[] args) 
	{
		int i = 0; // bitwise or
		if ((i++ == 0) | (i++ == 1))//both will be check.if any 1 one operant will true that is sufficient 
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
}
}
// i = 0,1,2,3