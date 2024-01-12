class P 
{
	int i = 10;
	int j = 20;

	public static void main(String[] args) 
	{
		final P p1 = new P();
		p1.i = 20;
		p1.j = 25;

		System.out.println(p1.i);
		System.out.println(p1.j);
	}
}
