class R14 
{   
	int i ;
	public static void main(String[] args) 
	{
		 R14 i1 = new R14();
		 R14 i2  = i1;
		 R14 i3  = i2;
		 R14 i4  = i3;
		System.out.println(i1.i);
		System.out.println(i2.i);
		System.out.println(i3.i);
		System.out.println(i4.i);
		i1.i= 30;
		System.out.println(i1.i);
		System.out.println(i2.i);
		System.out.println(i3.i);
		System.out.println(i4.i);
		i2.i = 40;
		System.out.println(i1.i);
		System.out.println(i2.i);
		System.out.println(i3.i);
		System.out.println(i4.i);
		i3.i = 50;
		System.out.println(i1.i);
		System.out.println(i2.i);
		System.out.println(i3.i);
		System.out.println(i4.i);
		i4.i = 75;
		System.out.println(i1.i);
		System.out.println(i2.i);
		System.out.println(i3.i);
		System.out.println(i4.i);
	}
}
