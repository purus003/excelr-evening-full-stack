class C4 
{
	int i;
	C4()
	{
		i = 20;
		System.out.println("C4()");
	}
	public static void main(String[] args) 
	{
		C4 c1 =new C4();
		System.out.println(c1.i);
		System.out.println("done");
	}
}
