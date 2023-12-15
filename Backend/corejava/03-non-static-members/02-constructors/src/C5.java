class C5 
{
	int i;
	C5( int i)
	{
		this.i = i;
		System.out.println("C5()");

	}
	public static void main(String[] args) 
	{
		C5 c2 = new C5(20);
		System.out.println("done " + c2.i);
	}
}
