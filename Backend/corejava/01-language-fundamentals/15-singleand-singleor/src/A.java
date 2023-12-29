class A 
{
	public static void main(String[] args) 
	{
		int i = 0; // & bitwiseand
		if ((i++ == 1) & (i++ == 1))// both must be true and it will check both operants whenever both true it will be excuted true
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
}
}