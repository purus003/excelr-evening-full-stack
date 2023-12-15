class BB 
{
	{
		System.out.println("IIB-1");
	}
	BB()
	{
		System.out.println("BB()");
	}
	BB(int i)
	{
		this(10,20);
		System.out.println("BB(int)");
	}
	BB(int i , int j)
	{
		this();
		System.out.println("BB(int ,int)");
	}
	public static void main(String[] args) 
	{
		BB b1 =new BB();
		System.out.println("------------");
		BB b2 =new BB();
		System.out.println("------------");
		BB b3 =new BB(90);
		System.out.println("------------");
		BB b4 =new BB(10,20);
		System.out.println("------------");
	}
	{
		System.out.println("IIB-2");
	}

}
