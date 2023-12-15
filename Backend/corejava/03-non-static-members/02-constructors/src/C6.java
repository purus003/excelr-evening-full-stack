class C6 
{
	int i;
	C6(int k)
	{
		i = k;
		System.out.println("C6(int):" + k);

	}
	public static void main(String[] args) 
	{
		C6 c2 = new C6(50);
		System.out.println("done " + c2.i);
	}
}
