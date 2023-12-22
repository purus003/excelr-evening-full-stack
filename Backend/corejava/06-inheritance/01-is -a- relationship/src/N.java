class M // object class  there 
{
	M()
	{
		// super(); // default will keep complier
		System.out.println("M()");
	}
}
class N extends M
{
	// whenever u create an object the complier will creatre default constructor or u create a constructor the complier not give default constructor
    /*
	N()
	{
		super();
	}
	*/
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("from N main");
	}
}
