class S
{
	public static void main(String[] args)
	{
		String s1 = null;//String s1 =  null + null;
		String s2 = s1 + null;// in this case one of the operand is of string type
		String s3 = null + s1;
		System.out.println(s1);//null
		System.out.println(s2);//nullnull
		System.out.println(s3);//nullnull

		/*
		S s4 = null;
		S s5 = s4 + null;
		System.out.println(s5);*/
	}
}
/* null value can be supplyed to any derived datatype
*/