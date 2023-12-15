class B
{
	B()
	{
		System.out.println("B()");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
/*
1.if at least one constructor kept by the user then complier will not be keeping deafult constructor.
2.constructors name should be  same class name.
3.constructors cant have a return type.
4.constructors are not noraml methods but internally they are special kind of methods.
5.constructor is non -static.
6.constructors are used to intilize the objects.
7.constructr can take any number of arguments.
8. constructors must be having a body {}.
9. we can any number of valid  statements inside the constructor body.
10. in one class we develop any no.of constructors but arguments must different.

*/