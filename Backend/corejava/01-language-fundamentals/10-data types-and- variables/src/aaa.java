class aaa 
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + (i = 20) + i;
		int k = 30 + j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}