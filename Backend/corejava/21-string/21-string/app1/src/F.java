class F
{
	public static void main(String[] args)
	{	
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));//equals method from object class in the string class compare the content wise.
		//== is compare reference.
		
		String s3 = new String("hello");
		String s4 = new String("Welcome");
		System.out.println(s3.equals(s4));
	}
}