class Q 
{
	int i;
	void test(Q ref)// reference variable anthying
	// ref = q1
	{
		System.out.println("from test(Q): " + ref.i);//10
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.i = 10;
		q1.test(q1);
		System.out.println("main end:" + q1.i);//10
	}
}
