class Q
{
	static int i;
	static int j = i = 10;// compound assignment
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
