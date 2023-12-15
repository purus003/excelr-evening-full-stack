class F1 
{
	static int counter= 20;
	{
		counter *= 2;
	}
	{
		counter *= 2;
	}
	F1()
	{
		counter *= 2;
	}
	F1(int i)
	{
		counter *= 2;
	}
	F1(int i, int j)
	{
		counter *= 2;
	}
	public static void main(String[] args) 
	{
		F1 obj1 =new F1();
		F1 obj2 =new F1(10);
		F1 obj3 =new F1(10,20);
		System.out.println("A: " + obj1.counter);
		System.out.println("B: " + obj2.counter);
		System.out.println("C: " + obj3.counter);
	}
}
