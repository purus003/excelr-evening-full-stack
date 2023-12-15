class OO 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World! from OO begin");
		PP.main(null);
		System.out.println("Hello World! from OO end");
	}
}
class PP 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World! from PP begin");
		QQ.main(null);
		System.out.println("Hello World! from PP end");
	}
}
class QQ
{
	static public void main(String[] args) 
	{
		System.out.println("Hello World! from Q begin");
	}
}
