class D 
{
    static int counter;
	D()
	{
		counter++;
	}
	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("A------------A:"+obj1.counter);//1
		D obj2 = new D();
		System.out.println("B------------B:"+obj2.counter);//2
		D obj3 = new D();
		System.out.println("C------------C:"+obj3.counter);//3
		D obj4 = new D();
		System.out.println("D------------D:"+obj4.counter);//4
		D obj5 = new D();
		System.out.println("E------------E:"+obj5.counter);//5
		System.out.println("final------------final:"+obj1.counter);
		System.out.println("final------------final:"+obj2.counter);
		System.out.println("final------------final:"+obj3.counter);
		System.out.println("final------------final:"+obj4.counter);
		System.out.println("final------------final:"+obj5.counter);
	}
}
