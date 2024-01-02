class W 
{
	public static long test(double d)
	{
		return (long)d;
	}
	public static void main(String[] args) 
	{
		double d = 10.2;
		float f = test((byte)(double)(byte)(short)(long)(double)(float)(double)d);
		System.out.println("f:"+f);
	}
}
