class  LL
{
	static int x = 100;
	public static void main(String[] args) 
	{
		System.out.println(x);
		int x = 20;
		System.out.println(x);
		System.out.println(LL.x);
	     x = 30;
		System.out.println(x);
		System.out.println(LL.x);
		LL.x = 200;
		System.out.println(x);
		System.out.println(LL.x);

	}
}
