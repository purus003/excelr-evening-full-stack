class E 
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);// two convert the int value which is in the form of String into primiteve int 
		int j = Integer.parseInt(args[1]);
		int k = i + j;
		System.out.println("addition of " + i + " and " + j + " is: " + k);
	}
}
