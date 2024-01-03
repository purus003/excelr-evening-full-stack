class M10 
{
	static Object test1()
	{
		Son son = new Son();
		//System.out.println("son: "+ son);
		return son;//(Object)son;
	}
	public static void main(String[] args) 
	{
		Object obj  =test1();
		//System.out.println("obj:"+ obj);
		System.out.println("done");
	}
}
