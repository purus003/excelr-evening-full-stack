class D1 
{
	static int counter;
	D1()
	{
		counter++;
	}
	public static void main(String[] args) 
	{
		D1 obj1 = new D1();
		System.out.println("A:"+ obj1.counter);
		D1 obj2 = new D1();
		System.out.println("B:" + obj2.counter);
		D1 obj3 = new D1();
		System.out.println("C:"+ obj3.counter);
		D1 obj4 = new D1();
		System.out.println("D:" + obj4.counter);
		D1 obj5 = new D1();
		System.out.println("E:" + obj5.counter);
		System.out.println("fianl ------ final:" + obj1.counter);
		System.out.println("fianl ------ final:" + obj2.counter);
		System.out.println("fianl ------ final:" + obj3.counter);
		System.out.println("fianl ------ final:" + obj4.counter);
		System.out.println("fianl ------ final:" + obj5.counter);
	}
}
