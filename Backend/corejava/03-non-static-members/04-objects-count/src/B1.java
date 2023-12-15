class B1 
{
	static int x;

	public static void main(String[] args) 
	{
		System.out.println("A" + x);
		System.out.println("B" + B1.x);

		B1 obj1 = new B1();
		B1 obj2 = new B1();
		System.out.println("c" + obj1.x);
		System.out.println("B" + obj2.x);
	}
}
