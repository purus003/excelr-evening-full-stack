class I 
{
	I(int i)
    {
		System.out.println("I(int)");
    }
	I()
	{
		System.out.println("I()");
	}
	public static void main(String[] args) 
	{
		I i1 = new I();
		I i2 = new I(10);
		System.out.println("done");
	}
}

