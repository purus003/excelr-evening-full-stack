package pack1;
class B 
{
	private void test(){
		System.out.println("from test()");
	}
	public static void main(String[] args) 
	{
		 B obj = new B();
		 obj.test();
		System.out.println("done");
	}
}
