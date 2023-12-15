class E 
{
	static int count =10;
	E()
	{
		count *=2;//10*2 =20
	}
	E(int i)
	{
		count *=2;//20*4 = 40
	}
	E(int i, int j)
	{
		count *=2;//40*2 =80
	}
	public static void main(String[] args) 
	{
		E obj1 = new E();
		E obj2 = new E(10);
		E obj3 = new E(10,20);
		System.out.println("A:" + obj1.counter);
		System.out.println("B:" + obj2.counter);
		System.out.println("C:"  + obj3.counter);
	}
}
