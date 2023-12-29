class M34 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test() + test());// test() it will convert  return value and . test() it will also convert 100
		// then return value 100+100 =200
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
}
/*
main begin
from test
from test
200
main end*/