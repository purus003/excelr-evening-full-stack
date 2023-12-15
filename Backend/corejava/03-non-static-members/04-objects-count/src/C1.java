class C1
{
	int counter;
	C1()
	{
		counter++;
	}
	public static void main(String[] args) 
	{
		C1 obj1 = new C1();
		System.out.println("A:"+ obj1.counter);
		C1 obj2 = new C1();
		System.out.println("B:" + obj2.counter);
		C1 obj3 = new C1();
		System.out.println("C:"+ obj3.counter);
		C1 obj4 = new C1();
		System.out.println("D:" + obj4.counter);
		C1 obj5 = new C1();
		System.out.println("E:" + obj5.counter);
	}
}
