class C
{
	int i;

	public String toString()
	{
		return "i = " + i;
	}
}
class D
{
	int j;
	C cat;

	public String toString()
	{
		return "j = " + j + ", " + cat;
	}
}
class M7  
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.i = 10;
		D d1 = new D();
		d1.j = 20;
		d1.cat = c1;
		System.out.println(c1);
		System.out.println(d1);
	}
}
/*
1."has a" relationship D has C type, C class contains one attribute, D class contains two attributes.
*/
