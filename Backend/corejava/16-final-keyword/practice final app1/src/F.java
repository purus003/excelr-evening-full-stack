class F 
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		final F f2 = new F();
		f1 = f2;
		f2 = f1;
		f2 = null;
		f2 = new F();
		System.out.println("Hello World!");
	}
}
/*F.java:8: error: cannot assign a value to final variable f2
                f2 = f1;
                ^
F.java:9: error: cannot assign a value to final variable f2
                f2 = null;
                ^
F.java:10: error: cannot assign a value to final variable f2
                f2 = new F();*/