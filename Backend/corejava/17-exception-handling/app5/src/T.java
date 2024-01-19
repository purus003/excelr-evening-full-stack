class T
{
	static void test() throws Throwable
	{
		Class.forName("");
	}
	public static void main(String[] args) throws Throwable
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}

//test() - Exception, main() - Exception possible
//test() - Exception, main() - Throwable possible
//test() - Throwable, main() - Exception not possible
//test() - Throwable, main() - Throwable possible
