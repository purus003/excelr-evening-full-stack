interface K
{
	void test1();
}
class L implements K
{
	public void test1()
	{
		System.out.println("from L-test1");
	}
	public static void main(String... args)
	{
		// object creation is not possible for intefaces
		//K k1 = new K();
		K obj = null;
		K obj1 = new L();//super interface reference is hold  sub class object is possible 
		obj1.test1();
		System.out.println("done");
	}
}