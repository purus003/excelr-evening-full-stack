class O 
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = 10;
		class A
		{
			void test()
			{
				//i is allowed to use in the class A if i is not modified anywhere
				//i is non final there might be a chance of modifying somewhere
				//class A should not depend on changes of i and j
				System.out.println(i);
				System.out.println(j);//we can use final j
			}
		}
		A a1 = new A();
		a1.test();
		//i = 20;
		//j = 20;
		System.out.println(i);
		System.out.println(j);
		a1.test();
		System.out.println("done");
	}
}
/*

O.java:14: error: local variables referenced from an inner class must be final or effectively final
                                System.out.println(i);
                                                   ^
1 error
*/