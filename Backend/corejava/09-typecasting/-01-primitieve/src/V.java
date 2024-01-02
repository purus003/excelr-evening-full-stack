class V
{
	public static void main(String[] args) 
	{
		double d = 20.9;
		float f = (byte)(double)(byte)(short)(int)(long)(double)(float)(double)d;
		System.out.println("f: "+f);
	}
}
// we can able convert any number types and any type of data.
//starting point will be at last.