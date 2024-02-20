interface A
{
	void test(int i);
}
class M3
{
	public static void main(String[] args) 
	{
		A a2 = (int x) -> {
						System.out.println("from test: LE: " + x);
						for (int i = 5;i <= 5 ; i++ )
						{
							System.out.println("from loop"+ i);
						}
						System.out.println("from test: LE");
						System.out.println("from test: LE");
					 };
		a2.test(20);
	}
}
