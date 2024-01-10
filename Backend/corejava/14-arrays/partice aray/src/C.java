class C 
{
	public static void main(String[] args) 
	{
		int x[]=new int[4];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		x[0]= 100;
		x[1]= 200;
		x[2]= 300;
		x[3]= 400;
		x= null;
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);

	}
}
