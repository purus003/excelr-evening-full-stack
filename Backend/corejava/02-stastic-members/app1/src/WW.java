class WW 
{
	static int i = 20;
	static int j = 30;
	static int k = (i += 100) + (j *=2);
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
