class M14 
{
	static void test1(GrandFather grandFather)
	{
		System.out.println("from test(B)");
	}
	public static void main(String[] args) 
	{
		Ancestor ancestor = new GrandFather();
		test1((GrandFather)ancestor);//manual downcasting
		System.out.println("done");
	}
}