class F 
{
	static int i = 10;

	static int test()
	{
		System.out.println("from test()");
		return 20;
	}
}
// in java jdk <= 1.6 executing witout main method is possible
// from java jdk >= 1.7 executing class without main method is not possible