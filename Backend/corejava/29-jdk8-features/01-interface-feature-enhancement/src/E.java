//interface doesnt have to depend on any other classes for the abstract method implementations.
//because it have its own method implementations using static and default methods.
interface E
{
	// this static methods does not inherited to ther classes .
	static void test1()
	{
		System.out.println("test1()");
	}

	static void test2()
	{
		System.out.println("test2()");
	}

	default void test3()
	{
		System.out.println("test3()");
	}

	default void test4()
	{
		System.out.println("test4()");
	}
	//void test5();
}
class F implements E
{
	public static void main(String[] args) 
	{
		E.test1();//static refernce accesss directily with class refernece
		E.test2();
	
		F obj = new F();// default methods must create as object F class then only u can acesss the  non static methods.
		obj.test3();
		obj.test4();
		System.out.println("done");
	}
}
