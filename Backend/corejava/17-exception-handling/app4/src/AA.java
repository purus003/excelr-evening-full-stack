class AA 
{
	public static void main(String[] args) 
	{
	try
	{
		System.out.println("from try begin");
		int i = 10 / 0;
		System.out.println("from try end");
	}
	catch (ArithmeticException ex)
	{
          System.out.println("from catch ");
	}
	try
	{
		int j = Integer.parseInt("abc");
	}
	catch (NumberFormatException ex)
	{
	}
	try
	{
		String s1 = null;
		int k = s1.length();
	}
	catch (NullPointerException ex)
	{
	}
	try
	{
		int[] l = new int[4];
		int m = l[4];
	}
	catch (ArrayIndexOutOfBoundsException ex)
	{
	}
	try
	{
		Object obj = new L();
		String s = (String)obj;
	}
	catch (ClassCastException ex)
	{
	}
	try
	{
		main(null);
	}
	catch (StackOverflowError ex)
	{
	}
	try
	{
		int[] n = new int[99999999];
	}
	catch (OutOfMemoryError ex)
	{
	}
	try
	{
		String s2 = "hello";
		String s3 = s2.substring(5, 10);
	}
	catch (StringIndexOutOfBoundsException ex)
	{
	}
	try
	{
		int[] p = new int[-10];
	}
	catch (NegativeArraySizeException ex)
	{
	}
		System.out.println("Hello World!");
	}
}
