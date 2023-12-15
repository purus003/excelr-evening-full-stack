class E1 
{
	static int counter = 20;
	E1()
	{
		counter *= 2;
	}
	E1(int i)
	{
		counter *= 2;
	}
	E1(int i, int j)
	{
		counter *= 2;
	}
	public static void main(String[] args) 
	{
		E1 obj1 =new E1();
		E1 obj2 =new E1(10);
		E1 obj3 =new E1(10,20);
		System.out.println("A: " + obj1.counter);
		System.out.println("B: " + obj2.counter);
		System.out.println("C: " + obj3.counter);
	}
}
