class E
{
	public static void main(String[] args) 
	{
		// by default whole number considered as int value only
		// int will be upcasted to long
		// l or L at the end of the integer value
		long l = 1000L;
		long m = 1000l;
		System.out.println(l);
		System.out.println(m);
	}
}